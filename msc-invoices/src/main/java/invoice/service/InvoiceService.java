package invoice.service;

import invoice.domain.Invoice;
import invoice.domain.InvoiceCompany;
import invoice.domain.InvoiceRow;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by bekas on 04/05/16.
 */

@Service
public class InvoiceService {


    Invoice dummyInvoice() {
        return new Invoice(1L, "number", 1, 1, 1L, 1L, 1L, new ArrayList<InvoiceRow>(), 1, new Date(), 1L, new ArrayList<InvoiceCompany>());

    }

    public void create(Invoice invoice) {

    }

    public Invoice get(Long invoiceId) {
        return dummyInvoice();
    }

     void addAsPeriodicInvoice() {

    }

     void removePeriodicInvoice() {

    }


    public Invoice getWithCompanies(Long invoiceId) {
        return null;
    }

    public List<Invoice> getList(Long companyId, Long limit, Long from, Long order, Date startDate, Date endDate) {
        return null;
    }

    public void edit(Invoice invoice) {

    }
}
