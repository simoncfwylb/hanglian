package com.hangliantx.mq.service.producer.impl;

import com.hangliantx.mq.service.producer.ProducerService;
import org.apache.commons.logging.LogFactory;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

/**
 * Created by changfei on 2016/6/20.
 */
@Component("ProducerService")
public class ProducerServiceImpl implements ProducerService {

    Logger logger =Logger.getLogger(ProducerService.class);

    @Autowired
    private JmsTemplate jmsTemplate;

    public void sendMsg(Destination destination, final String msg) {
        System.out.println("[生产者发送消息]");
        logger.info("[生产者发送消息]");
        jmsTemplate.send(destination, new MessageCreator() {
            public Message createMessage(Session session) throws JMSException {
                return session.createTextMessage(msg);
            }
        });

    }
}
