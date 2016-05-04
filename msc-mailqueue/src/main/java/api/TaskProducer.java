package api;

import config.CommonQueueConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by bekas on 04/05/16.
 */
public class TaskProducer {


        @Autowired
        private CommonQueueConfig commonQueueConfiguration;

        public void sendNewTask(TaskMessage taskMessage)
        {
            commonQueueConfiguration.rabbitTemplate()
                    .convertAndSend(commonQueueConfiguration.commonQueue, taskMessage);
        }


}
