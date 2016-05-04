package invoice.domain;

import java.util.Date;
import java.util.List;

/**
 * Created by bekas on 04/05/16.
 */
public class Invoice {

    private Long id;
    private String number;
    private InvoiceStatus status;
    private InvoiceType type;
    private InvoicePeriod period;
    private Long templateId;
    private Long issuer;
    private Long payer;
    private List<InvoiceRow> invoiceRows;
    private Integer tax;
    private Date createDate;
    private Long creator;
    private InvoiceCompany issuerCompany;
    private InvoiceCompany payerCompany;

    public InvoicePeriod getPeriod() {
        return period;
    }

    public InvoiceCompany getIssuerCompany() {
        return issuerCompany;
    }

    public InvoiceCompany getPayerCompany() {
        return payerCompany;
    }

    public void setIssuerCompany(InvoiceCompany issuerCompany) {
        this.issuerCompany = issuerCompany;
    }

    public void setPayerCompany(InvoiceCompany payerCompany) {
        this.payerCompany = payerCompany;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setStatus(InvoiceStatus status) {
        this.status = status;
    }

    public void setType(InvoiceType type) {
        this.type = type;
    }

    public void setPeriod(InvoicePeriod period) {
        this.period = period;
    }

    public void setTemplateId(Long templateId) {
        this.templateId = templateId;
    }

    public void setIssuer(Long issuer) {
        this.issuer = issuer;
    }

    public void setPayer(Long payer) {
        this.payer = payer;
    }

    public void setInvoiceRows(List<InvoiceRow> invoiceRows) {
        this.invoiceRows = invoiceRows;
    }

    public void setTax(Integer tax) {
        this.tax = tax;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setCreator(Long creator) {
        this.creator = creator;
    }

    public Long getId() {
        return id;
    }

    public String getNumber() {
        return number;
    }

    public InvoiceStatus getStatus() {
        return status;
    }

    public InvoiceType getType() {
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
}
