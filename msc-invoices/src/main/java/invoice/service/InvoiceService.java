package invoice.service;

import invoice.domain.Invoice;
import invoice.external.CompanyResource;
import invoice.external.InvoiceRelatedEvent;
import invoice.external.InvoiceRelatedEventType;
import invoice.external.QueueProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by bekas on 04/05/16.
 */

@Service
public class InvoiceService {

    @Autowired
    private QueueProducer queueProducer;

    @Autowired
    private CompanyResource companyResource;

    public void create(Invoice invoice) {
        // todo save invoice in db

        queueProducer.sendNewTask(new InvoiceRelatedEvent(InvoiceRelatedEventType.CREATED, invoice));
    }

    public Invoice get(Long invoiceId) {
        // todo fetch invoice

        return null;
    }

    public Invoice getWithCompanies(Long invoiceId) {

        Invoice invoice = new Invoice(); // todo fetch invoice

        invoice.setIssuerCompany(companyResource.getCompanyData(invoice.getIssuer()));
        invoice.setPayerCompany(companyResource.getCompanyData(invoice.getPayer()));

        return invoice;
    }

    public List<Invoice> getList(Long companyId, Long limit, Long from, Long order, Date startDate, Date endDate) {
        // todo fetch invoices
        return null;
    }

    public void edit(Invoice invoice) {
        // todo save invoice in db

        queueProducer.sendNewTask(new InvoiceRelatedEvent(InvoiceRelatedEventType.UPDATED, invoice));
    }

}
