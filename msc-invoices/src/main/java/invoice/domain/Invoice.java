package invoice.domain;

import java.util.Date;
import java.util.List;

/**
 * Created by bekas on 04/05/16.
 */
public class Invoice {

    private final Long id;
    private final String number;
    private final Integer status;
    private final Integer type;
    private final Long templateId;
    private final Long issuer;
    private final Long payer;
    private final List<InvoiceRow> invoiceRows;
    private final Integer tax;
    private final Date createDate;
    private final Long creator;

    public Invoice(Long id, String number, Integer status, Integer type, Long templateId, Long issuer, Long payer, List<InvoiceRow> invoiceRows, Integer tax, Date createDate, Long creator, List<InvoiceCompany> companies) {
        this.id = id;
        this.number = number;
        this.status = status;
        this.type = type;
        this.templateId = templateId;
        this.issuer = issuer;
        this.payer = payer;
        this.invoiceRows = invoiceRows;
        this.tax = tax;
        this.createDate = createDate;
        this.creator = creator;
        this.companies = companies;
    }

    private final List<InvoiceCompany> companies;

    public Long getId() {
        return id;
    }

    public String getNumber() {
        return number;
    }

    public Integer getStatus() {
        return status;
    }

    public Integer getType() {
        return type;
    }

    public Long getTemplateId() {
        return templateId;
    }

    public Long getIssuer() {
        return issuer;
    }

    public Long getPayer() {
        return payer;
    }

    public List<InvoiceRow> getInvoiceRows() {
        return invoiceRows;
    }

    public Integer getTax() {
        return tax;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public Long getCreator() {
        return creator;
    }

    public List<InvoiceCompany> getCompanies() {
        return companies;
    }
}
