package company.external;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import company.config.StatsServiceConfig;
import company.domain.CompanyStat;
import company.domain.StatPeriod;
import company.domain.StatType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by bekas on 04/05/16.
 */

@Component
public class StatsResource {

    @Autowired
    private StatsServiceConfig statsServiceConfig;

    @HystrixCommand(fallbackMethod = "statsServiceOffline")
    public CompanyStat getUnpaidStats(List<Long> companyIds) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(statsServiceConfig.getUnpaidUrl("") + companyIds, CompanyStat.class);
    }

    CompanyStat statsServiceOffline(List<Long> companyIds) {
        return new CompanyStat(0L, new Date(), 0, StatType.INCOME);
    }


    @HystrixCommand(fallbackMethod = "hystrixServiceOffline")
    public String hystrixCheck() {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject("http://192.168.50.4:30777/hystrixTest", String.class);
    }

    String hystrixServiceOffline() {
        return "error";
    }
}
