package company.external;

import company.config.StatsServiceConfig;
import company.domain.CompanyStat;
import company.domain.StatPeriod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

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

    //@HystrixCommand(fallbackMethod = "statsServiceOffline")
    public Map<Long, CompanyStat> getUnpaidStats(List<Long> companyIds) {
        //RestTemplate restTemplate = new RestTemplate();
        //return restTemplate.getForObject(statsServiceUrl + "stat/" + companyIds, Map<Long, CompanyStat>.class);
        return null;
    }

    public Map<Long, List<CompanyStat>> getIncomeStats(Date start, Date end, List<Long> companyIds, StatPeriod statPeriod) {
        return null;
    }


    Map<Long, CompanyStat> statsServiceOffline(List<Long> companyIds) {
        return new HashMap<Long, CompanyStat>();
    }
}
