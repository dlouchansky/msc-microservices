package invoice.config;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by bekas on 04/05/16.
 */

@Configuration
public class InvoiceQueueConfig extends RabbitMqConfig {
    public final String invoiceQueue = "invoice.queue";

    @Bean
    public RabbitTemplate rabbitTemplate() {
        RabbitTemplate template = new RabbitTemplate(connectionFactory());
        template.setRoutingKey(this.invoiceQueue);
        template.setQueue(this.invoiceQueue);
        template.setMessageConverter(jsonMessageConverter());
        return template;
    }

    @Bean
    public Queue queue() {
        return new Queue(invoiceQueue);
    }
}
