package invoice.domain;

/**
 * Created by bekas on 04/05/16.
 */
public class InvoiceCompany {

    private final Long companyId;
    private final String name;

    public InvoiceCompany(Long companyId, String name) {
        this.companyId = companyId;
        this.name = name;
    }

    public Long getCompanyId() {

        return companyId;
    }

    public String getName() {
        return name;
    }
}
