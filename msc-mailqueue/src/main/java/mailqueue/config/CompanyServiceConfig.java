package mailqueue.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import java.net.URI;

/**
 * Created by bekas on 05/05/16.
 */
@Configuration
public class CompanyServiceConfig {

    @Value("${COMPANY_SERVICE_ADDRESS}")
    private String companyServiceUrl;

    public String getCompanyUrl(Long companyId) {
        return companyServiceUrl + "/company" + companyId;
    }
}
