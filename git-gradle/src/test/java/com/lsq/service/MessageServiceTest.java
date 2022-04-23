package com.lsq.service;

import com.lsq.service.impl.MessageServiceImpl;
import org.junit.Test;

public class MessageServiceTest {

    @Test
    public void test01(){
        MessageServiceImpl messageService = new MessageServiceImpl();
        String gradle = messageService.echo("gradle");
        System.out.println("gradle = " + gradle);
    }

}
