package com.hangliantx.mq.service.producer;

import javax.jms.Destination;

/**
 * Created by changfei on 2016/6/20.
 */
public interface ProducerService {

    public void sendMsg(Destination destination, final String msg);

}
