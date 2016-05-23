package company.external;

import org.springframework.stereotype.Component;

/**
 * Created by bekas on 22/05/16.
 */

@Component
public class QueueConsumer {
    public QueueConsumer() {
    }

    public void handleMessage(CompanyDataUpdatedEvent scrapingResultMessage)
    {
        System.out.println("Message received: " + scrapingResultMessage.getMsg());
    }
}
