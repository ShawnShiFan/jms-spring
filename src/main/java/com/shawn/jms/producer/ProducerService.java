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

/**
 * @Description
 * @Author: Shawn
 * @Date: 2019/5/27 15:57
 * @Version 1.0
 */
public interface ProducerService {
    void sendMessage(String message);
}
