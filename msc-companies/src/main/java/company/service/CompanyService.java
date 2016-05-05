package company.service;

import company.domain.Company;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Created by bekas on 04/05/16.
 */

@Service
public class CompanyService {

    public void create(Company company) {
        // todo create company
        // todo post event for monitoring
    }

    public Company get(Long companyId) {
        // todo get company
        return new Company(companyId, "company name", "company address", "email", 1, null);
    }

    public void edit(Company company) {
        // todo edit company
        // todo post event for monitoring
    }

    public List<Company> getCompaniesByIds(String companyIds) {
        List<String> parsedCompanyIds = Arrays.asList(companyIds.split("\\s*,\\s*"));

        List<Long> numeric = new ArrayList<>();

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
}
