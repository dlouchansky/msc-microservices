package invoice.external;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import invoice.domain.InvoiceCompany;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

/**
 * Created by bekas on 04/05/16.
 */
@Component
public class CompanyResource {

    URI companyServiceUrl = URI.create("http://localhost:8091/");

    @HystrixCommand(fallbackMethod = "companyServiceOffline")
    public InvoiceCompany getCompanyData(Long companyId) {
        RestTemplate restTemplate = new RestTemplate();
        InvoiceCompany forObject = null;
        try {
            forObject = restTemplate.getForObject(companyServiceUrl + "company/" + companyId, InvoiceCompany.class);
        } catch (Exception e) {
            System.out.println(e);
        }
        return forObject;
    }

    InvoiceCompany companyServiceOffline(Long companyId) {
        return new InvoiceCompany(companyId, "Company data not available");
    }


}
