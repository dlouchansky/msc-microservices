package mailqueue.service;

import mailqueue.domain.InvoicePeriod;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by bekas on 05/05/16.
 */

@Service
public class MailQueueService {


    public void addAsPeriodicInvoice(Long invoiceId, InvoicePeriod period, Date dateStart) {

    }

    public void removePeriodicInvoice(Long invoiceId) {

    }

    public void sendUnpaidNotification(Long invoiceId, Date when) {

    }

    public void removeUnpaidNotification(Long invoiceId) {

    }

    public void sendInvoice(Long invoiceId, Date when) {

    }

    public void addPeriodicStats(Long companyId) {

    }

    public void removePeriodicStats(Long companyId) {

    }
}
