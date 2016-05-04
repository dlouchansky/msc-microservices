package config;

import org.springframework.amqp.core.AmqpAdmin;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitAdmin;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by bekas on 04/05/16.
 */
@Configuration
public class RabbitMqConfig
{

    public static final String RABBIT_MQ_ADDRESS = "192.168.22.10";
    public static final String RABBIT_MQ_USER = "user";
    public static final String RABBIT_MQ_PASSWORD = "password";

    @Bean
    public ConnectionFactory connectionFactory()
    {
        CachingConnectionFactory connectionFactory = new CachingConnectionFactory(RABBIT_MQ_ADDRESS);
        connectionFactory.setUsername(RABBIT_MQ_USER);
        connectionFactory.setPassword(RABBIT_MQ_PASSWORD);
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