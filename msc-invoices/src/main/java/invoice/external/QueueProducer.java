package invoice.external;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import invoice.config.InvoiceQueueConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by bekas on 04/05/16.
 */

@Component
public class QueueProducer {

    @Autowired
    private InvoiceQueueConfig invoiceQueueConfig;

    @HystrixCommand(fallbackMethod = "reliable")
    public void sendNewTask(InvoiceRelatedEvent invoiceRelatedEvent) {
        invoiceQueueConfig.rabbitTemplate()
                .convertAndSend(invoiceQueueConfig.invoiceQueue, invoiceRelatedEvent);
    }

    public void reliable() {

    }
}
