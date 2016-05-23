package company.api; /**
 * Created by bekas on 03/05/16.
 */

import company.domain.Company;
import company.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@RestController
@RequestMapping({"/v1", "/"})
public class CompanyControllerV1 {

    @Autowired
    CompanyService companyService;

    @RequestMapping(path = "/createCompany", method = RequestMethod.PUT)
    public ResponseEntity<Void> createCompany(@RequestBody Company company,
                                              UriComponentsBuilder ucBuilder) {
        companyService.create(company);
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(ucBuilder.path("/company/{id}").buildAndExpand(company.getId()).toUri());
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
    }

    @RequestMapping(path = "/editCompany", method = RequestMethod.POST)
    public ResponseEntity<Void> editCompany(@RequestBody Company company,
                                            UriComponentsBuilder ucBuilder) {
        companyService.edit(company);
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(ucBuilder.path("/invoice/{id}").buildAndExpand(company.getId()).toUri());
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
    }

    @RequestMapping(path = "/company/{companyId}", method = RequestMethod.GET)
    public Company getCompany(@PathVariable(value = "companyId") Long companyId) {
        return companyService.get(companyId);
    }

    @RequestMapping(path = "/hystrixTest/{requestCount}/{delayInMsec}", method = RequestMethod.GET)
    public Long testHystrix(@PathVariable(value = "requestCount") Long requestCount,
                            @PathVariable(value = "delayInMsec") Long delayInMsec) throws InterruptedException {
        return companyService.testHystrix();
    }

    @RequestMapping(path = "/companies/{companyIds}", method = RequestMethod.GET)
    public List<Company> getCompanies(@PathVariable(value = "companyIds") String companyIds
    ) {

        return companyService.getCompaniesByIds(companyIds);
    }

    @RequestMapping(path = "/companies/{companyIds}/stats", method = RequestMethod.GET)
    public List<Company> getCompaniesWithStats(@PathVariable(value = "companyIds") String companyIds
    ) {

        return companyService.getCompaniesByIdsWithStats(companyIds);
    }

    @ExceptionHandler(Exception.class)
    @ResponseBody
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    public String handleException(Exception e) {
        return "some error happened" + e;
    }
}
