package mailqueue.config;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by bekas on 04/05/16.
 */

@Configuration
public class CommonQueueConfig extends RabbitMqConfig
{
    public final String commonQueue = "common.queue";

    @Bean
    public RabbitTemplate rabbitTemplate()
    {
        RabbitTemplate template = new RabbitTemplate(connectionFactory());
        template.setRoutingKey(this.commonQueue);
        template.setQueue(this.commonQueue);
        template.setMessageConverter(jsonMessageConverter());
        return template;
    }

    @Bean
    public Queue tasksQueue()
    {
        return new Queue(this.commonQueue);
    }
}
