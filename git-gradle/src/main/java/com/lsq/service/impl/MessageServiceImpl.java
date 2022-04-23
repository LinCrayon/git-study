package com.lsq.service.impl;

import com.lsq.service.IMessageService;

/**
 * @author linshengqian
 */
public class MessageServiceImpl implements IMessageService {
    @Override
    public String echo(String msg) {
        return "hello" +msg;
    }
}
