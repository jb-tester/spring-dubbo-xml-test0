package com.mytests.spring.dubbo.xml.test0;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * *
 * <p>Created by irina on 12/12/2022.</p>
 * <p>Project: spring-dubbo-xml-test0</p>
 * *
 */
public class RunConsumerApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("dubbo-consumer.xml");
         UseFoo useFoo = ctx.getBean(UseFoo.class);
         useFoo.display();
    }
}
