/*
 * ********************************************************************************
 * COPYRIGHT
 *               PAX TECHNOLOGY, Inc. PROPRIETARY INFORMATION
 *   This software is supplied under the terms of a license agreement or
 *   nondisclosure agreement with PAX  Technology, Inc. and may not be copied
 *   or disclosed except in accordance with the terms in that agreement.
 *
 *      Copyright (C) 2017 PAX Technology, Inc. All rights reserved.
 * ********************************************************************************
 */
package com.shawn.jms.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;

import javax.annotation.Resource;
import javax.jms.*;

/**
 * @Description
 * @Author: Shawn
 * @Date: 2019/5/27 16:24
 * @Version 1.0
 */
public class ProducerServiceImpl implements  ProducerService{

    @Autowired
    JmsTemplate jmsTemplate;
    @Resource(name = "topicDestination")
    Destination destination;
    @Override
    public void sendMessage(String message) {
        jmsTemplate.send(destination, new MessageCreator() {
           //创建一个消息
            @Override
            public Message createMessage(Session session) throws JMSException {
               TextMessage textMessage = session.createTextMessage(message);
                return textMessage;
            }
        });
        System.out.println("发送消息："+message);
    }

}
