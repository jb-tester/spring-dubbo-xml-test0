package com.mytests.spring.dubbo.xml.test0;

/**
 * *
 * <p>Created by irina on 12/12/2022.</p>
 * <p>Project: spring-dubbo-xml-test0</p>
 * *
 */
public class FooMulticastProvider implements FooService{
    @Override
    public String getFoo() {
        return "foo multicasted";
    }
}
