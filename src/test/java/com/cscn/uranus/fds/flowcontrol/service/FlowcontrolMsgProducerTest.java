package com.cscn.uranus.fds.flowcontrol.service;

import com.cscn.uranus.fds.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class FlowcontrolMsgProducerTest {

    @Autowired
    private FlowcontrolMsgProducer flowcontrolMsgProducer;

    @Test
    public void getNextFlowcontrolRawMsg() throws Exception {
        for (int i = 0; i < 360; i++) {
            assertNotNull(this.flowcontrolMsgProducer.getNextFlowcontrolRawMsg());
        }
    }

}