package com.hangliantx.mq.service.listener;

import javax.jms.*;
import java.util.Enumeration;

/**
 * Created by changfei on 2016/6/20.
 */
public class ConsumerListener implements MessageListener{
    public void onMessage(Message message) {
        TextMessage textMessage= (TextMessage) message;
        System.out.println("[接收到一个消息]");
        try {
            System.out.println("[消息内容:]"+textMessage.getText());
        }catch (JMSException e){
            e.printStackTrace();
        }
    }
}
