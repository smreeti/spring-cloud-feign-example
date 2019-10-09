package com.smriti.fiegnclient;

import com.smriti.fiegnclient.proxy.UserServiceProxy;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FiegnClientApplicationTests {

    @Autowired
    private UserServiceProxy proxy;

    @Test
    public void contextLoads() {

        proxy.listBillionaires();

    }

}
