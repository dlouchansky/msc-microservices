package company.external;

import company.config.CompanyInvoiceQueueConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by bekas on 22/05/16.
 */

@Component
public class QueueProducer {

    @Autowired
    private CompanyInvoiceQueueConfig companyInvoiceQueueConfig;

    public QueueProducer() {
    }

    public void sendNewTask() {
        System.out.println("sending message");

        CompanyDataUpdatedEvent companyDataUpdatedEvent = new CompanyDataUpdatedEvent();
        companyDataUpdatedEvent.setMsg("MessageText");
        companyInvoiceQueueConfig.rabbitTemplate()
                .convertAndSend(companyInvoiceQueueConfig.companyInvoiceQueue, companyDataUpdatedEvent);
    }

}
