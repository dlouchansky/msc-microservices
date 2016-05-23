package company.config;

import org.springframework.amqp.core.AmqpAdmin;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitAdmin;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by bekas on 22/05/16.
 */
@Configuration
public class RabbitMqConfig
{

    @Value("${RABBIT_MQ_ADDRESS}")
    private String RABBIT_MQ_ADDRESS;

    @Value("${RABBIT_MQ_USER}")
    private String RABBIT_MQ_USER;

    @Value("${RABBIT_MQ_PASSWORD}")
    private String RABBIT_MQ_PASSWORD;

    @Bean
    public ConnectionFactory connectionFactory()
    {
        CachingConnectionFactory connectionFactory = new CachingConnectionFactory(RABBIT_MQ_ADDRESS);
        connectionFactory.setUsername(RABBIT_MQ_USER);
        connectionFactory.setPassword(RABBIT_MQ_PASSWORD);
        System.out.println("USER" + RABBIT_MQ_USER + "PW" + RABBIT_MQ_PASSWORD + "ADD" + RABBIT_MQ_ADDRESS);
        return connectionFactory;
    }

    @Bean
    public AmqpAdmin amqpAdmin()
    {
        return new RabbitAdmin(connectionFactory());
    }


    @Bean
    public MessageConverter jsonMessageConverter()
    {
        return new Jackson2JsonMessageConverter();
    }
}