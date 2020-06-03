package com.xiaoba.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

@SpringBootTest(classes = RegisterServiceImplTest.class)
public class RegisterServiceImplTest extends AbstractTestNGSpringContextTests {

    @Autowired
    RegisterServiceImplTest registerServiceImplTest;

    @Test
    public void testRegisterUser() {
        if(registerServiceImplTest==null){
            System.out.print("===================================++++++++++++++++++++++++++");
        }
    }
}