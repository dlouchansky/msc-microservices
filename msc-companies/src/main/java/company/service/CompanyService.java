package company.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import company.domain.Company;
import company.external.QueueProducer;
import company.external.StatsResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by bekas on 04/05/16.
 */

@Service
public class CompanyService {

    @Autowired
    private QueueProducer companyInvoiceQueue;
    @Autowired
    private StatsResource statsService;

    public void create(Company company) {
        // todo create company
        // todo post event for monitoring
    }

    public Company get(Long companyId) {
        // todo get company

        System.out.println("Trying to send message");
        companyInvoiceQueue.sendNewTask();
        System.out.println("Trying to query stats-service");
        statsService.getUnpaidStats(new ArrayList<Long>());

        return new Company(companyId, "company name", "company address", "email", 1, null);
    }

    public void edit(Company company) {
        // todo edit company
        // todo post event for monitoring
    }

    public List<Company> getCompaniesByIds(String companyIds) {
        List<String> parsedCompanyIds = Arrays.asList(companyIds.split("\\s*,\\s*"));

        List<Long> numeric = new ArrayList<Long>();

        for (String id : parsedCompanyIds) {
            numeric.add(Long.parseLong(id));
        }

        // todo get companies by id list

        return null;
    }

    public List<Company> getCompaniesByIdsWithStats(String companyIds) {
        // todo implement
        return null;
    }

    public Long testHystrix() throws InterruptedException {
        // serviss strādā
        List<String> responses = new ArrayList<>();
        for (long i = 0; i < 10; i++) { // 10 pieprasījumi
            Thread.sleep(100); // 0.1 sekundes instervāls
            String response = statsService.hystrixCheck();
            responses.add(response);
        }
        System.out.println("Jābūt visiem ok: " + responses);

        // serviss nestrādā
        System.out.println("set error: " + setError());

        responses = new ArrayList<>();
        for (long i = 0; i < 50; i++) {
            Thread.sleep(100);
            String response = statsService.hystrixCheck();
            responses.add(response);
        }
        System.out.println("Jābūt visiem error: " + responses);
        return new Integer(responses.size()).longValue();
    }

    public String setError() {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject("http://192.168.50.4:30777/setError", String.class);
    }
}
