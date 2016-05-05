package company.config;

import org.springframework.context.annotation.Configuration;

import java.net.URI;
import java.util.List;

/**
 * Created by bekas on 05/05/16.
 */

@Configuration
public class StatsServiceConfig {

    private URI statsServiceUrl = URI.create("http://localhost:8090/");

    public String getUnpaidUrl(String companyIds) {
        return null;
    }

    public String getIncomeUrl(String companyIds) {
        return null;
    }
}
