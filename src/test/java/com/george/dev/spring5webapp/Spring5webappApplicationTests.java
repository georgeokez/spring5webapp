package com.george.dev.spring5webapp;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Spring5webappApplicationTests {

    private final Logger logger = LoggerFactory.getLogger(getClass().getName()); //Spring5webappApplicationTests.class);

    @Test
    public void contextLoads() {

        String str = new String("This is just a string");

        Integer numb = new Integer(94);

        Double doub = new Double(5.8);

        Long longNumb = new Long(5);

        Character charct = new Character('R');

    }

}
