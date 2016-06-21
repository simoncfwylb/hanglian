package com.hangliantx.mq.service.listener;

import org.apache.log4j.Logger;
import org.springframework.jms.listener.SessionAwareMessageListener;

import javax.jms.*;

public class ConsumerSessionAwareMessageListener implements
        SessionAwareMessageListener<TextMessage> {
    Logger logger=Logger.getLogger(ConsumerSessionAwareMessageListener.class);
    private Destination destination;
       
    public void onMessage(TextMessage message, Session session) throws JMSException {
        System.out.println("【】收到一条消息");
        logger.info("【】收到一条消息");
        logger.info("【】消息内容是：" + message.getText());
        System.out.println("【】消息内容是：" + message.getText());
        MessageProducer producer = session.createProducer(destination);
        Message textMessage = session.createTextMessage("【】 返回给接收端ConsumerSessionAwareMessageListener。。。");
        logger.info("【】 返回给接收端ConsumerSessionAwareMessageListener。。。");
        producer.send(textMessage);
    }   
    
    public Destination getDestination() {   
        return destination;
    }   
    
    public void setDestination(Destination destination) {   
        this.destination = destination;   
    }   
    
}  