package invoice.service;

import invoice.domain.Invoice;
import invoice.domain.InvoiceRepository;
import invoice.external.CompanyService;
import invoice.external.InvoiceRelatedEvent;
import invoice.external.InvoiceRelatedEventType;
import invoice.external.QueueProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Range;
import org.springframework.data.domain.Sort;
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
    private CompanyService companyService;

    @Autowired
    private InvoiceRepository invoiceRepository;

    public void create(Invoice invoice) {
        Invoice inserted = invoiceRepository.insert(invoice);
        queueProducer.sendNewTask(new InvoiceRelatedEvent(InvoiceRelatedEventType.CREATED, inserted));
    }

    public Invoice get(String invoiceId) {
        return invoiceRepository.findOne(invoiceId);
    }

    public Invoice getWithCompanies(String invoiceId) {
        Invoice invoice = invoiceRepository.findOne(invoiceId);

        invoice.setIssuerCompany(companyService.getCompanyData(invoice.getIssuer()));
        invoice.setPayerCompany(companyService.getCompanyData(invoice.getPayer()));

        return invoice;
    }

    public List<Invoice> getList(Long companyId, Long limit, Long from, Date startDate, Date endDate) {
        if (startDate == null || endDate == null) {
            Sort sortByDate = new Sort(Sort.Direction.ASC, "date");
            PageRequest getPage = new PageRequest((int)(from / limit), limit.intValue());
            return invoiceRepository.findByIssuer(companyId, sortByDate, getPage);
        } else {
            return invoiceRepository.findByIssuerCreateDate(companyId, new Range<Date>(startDate, endDate));
        }
    }

    public void edit(Invoice invoice) {
        Invoice updated = invoiceRepository.save(invoice);
        queueProducer.sendNewTask(new InvoiceRelatedEvent(InvoiceRelatedEventType.UPDATED, updated));
    }

}
