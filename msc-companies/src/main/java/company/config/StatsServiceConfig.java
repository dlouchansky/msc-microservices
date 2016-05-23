package company.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import java.net.URI;
import java.util.List;

/**
 * Created by bekas on 05/05/16.
 */

@Configuration
public class StatsServiceConfig {

    @Value("${STATS_SERVICE}")
    private String statsServiceUrl;

    public String getUnpaidUrl(String companyIds) {
        return statsServiceUrl + "/unpaid";
    }

    public String getIncomeUrl(String companyIds) {
        return statsServiceUrl + "/income";
    }
}
