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


import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description
 * @Author: Shawn
 * @Date: 2019/5/27 16:32
 * @Version 1.0
 */
public class AppProducer {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("producer.xml");
        ProducerService service =context.getBean(ProducerService.class);
        for (int i =0; i<100; i++){
            service.sendMessage("test"+i);
        }
         context.close();
    }
}
