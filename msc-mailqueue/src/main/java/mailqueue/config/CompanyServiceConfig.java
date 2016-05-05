package mailqueue.config;

import org.springframework.context.annotation.Configuration;

import java.net.URI;

/**
 * Created by bekas on 05/05/16.
 */
@Configuration
public class CompanyServiceConfig {

    private URI companyServiceUrl = URI.create("http://localhost:8091/");

    public String getCompanyUrl(Long companyId) {
        return companyServiceUrl + "/company" + companyId;
    }
}
