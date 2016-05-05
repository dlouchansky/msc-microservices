package mailqueue.external;

import mailqueue.config.CommonQueueConfig;
import org.springframework.beans.factory.annotation.Autowired;

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
