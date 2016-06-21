package com.hangtx.test.mq;

import com.hangliantx.mq.service.producer.ProducerService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.jms.Destination;

/**
 * Created by changfei on 2016/6/20.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/spring/applicationContext-mq.xml")
public class TestMq {

    @Autowired
    private ProducerService producerService;


    @Autowired
    @Qualifier("queueDestination")

    private Destination queueDestination;


    @Autowired
    @Qualifier("sessionQueuequeueDestination")
    private Destination sessionQueuequeueDestination;

    @Test
    public void testMq(){
        producerService.sendMsg(queueDestination,"hhhhhh=========================hhhhhhhhh");
    }


    @Test
    public void testMqSessionAware(){
        producerService.sendMsg(sessionQueuequeueDestination,"发送消息返回型的消息======");
    }

}
