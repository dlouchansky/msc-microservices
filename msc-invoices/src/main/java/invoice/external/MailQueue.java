package invoice.external;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.Date;
import java.util.Map;

/**
 * Created by bekas on 04/05/16.
 */
@Component
public class MailQueue {

    URI mailQueueServiceUrl = URI.create("http://localhost:8090/");

    @HystrixCommand(fallbackMethod = "reliable")
    public String addPeriodicInvoice(Long invoiceId, Integer period, Date dateStart) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(mailQueueServiceUrl + "removePeriodic", invoiceId, String.class);
    }

    @HystrixCommand(fallbackMethod = "reliable")
    public String removePeriodicInvoice(Long invoiceId) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(mailQueueServiceUrl + "removePeriodic", invoiceId, String.class);
    }

    String reliable() {
        return "Cloud Native Java (O'Reilly)";
    }




}
