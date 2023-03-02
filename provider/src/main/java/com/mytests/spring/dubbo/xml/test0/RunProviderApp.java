package com.mytests.spring.dubbo.xml.test0;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * *
 * <p>Created by irina on 12/12/2022.</p>
 * <p>Project: spring-dubbo-xml-test0</p>
 * *
 */
public class RunProviderApp {
    public static void main(String[] args) throws InterruptedException {
        // not necessary if multicast is used
       new EmbeddedZooKeeper(2181, false).start();
       Thread.sleep(1000);
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("dubbo-provider.xml");
        ctx.start();
        System.out.println("dubbo provider started");
        for (int i = 0; i >= 0 ; i++) {
            System.out.print(".");
        }
    }
}
