package com.hangliantx.mq.service.listener;

import org.apache.log4j.Logger;

import javax.jms.*;
import java.util.Enumeration;

/**
 * Created by changfei on 2016/6/20.
 */
public class ConsumerListener implements MessageListener{
    Logger logger =Logger.getLogger(ConsumerListener.class);
    public void onMessage(Message message) {
        TextMessage textMessage= (TextMessage) message;
        System.out.println("[接收到一个消息]");
        logger.info("[接收到一个消息]");
        try {
            logger.info("[消息内容:]"+textMessage.getText());
            System.out.println("[消息内容:]"+textMessage.getText());
        }catch (JMSException e){
            e.printStackTrace();
        }
    }
}
