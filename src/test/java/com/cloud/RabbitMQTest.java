package com.cloud;

import com.cloud.service.impl.Sender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class RabbitMQTest {

    @Autowired
    private Sender sender;

    @Test
    public void testRabbit1() throws Exception {
        sender.send();
    }

    @Test
    public void testRabbit2() throws Exception {
        for (int i = 0;i < 10;i++){
            sender.send();
        }
    }
}
