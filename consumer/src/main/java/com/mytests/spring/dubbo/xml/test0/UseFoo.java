package com.mytests.spring.dubbo.xml.test0;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * *
 * <p>Created by irina on 12/12/2022.</p>
 * <p>Project: spring-dubbo-xml-test0</p>
 * *
 */
@Component
public class UseFoo {

    private final FooService fooServiceMulti;
    private final FooService fooServiceZookeeper;
    private final FooService fooServiceSimple;

    public UseFoo(@Qualifier("foo-multi") FooService fooMulti, @Qualifier("foo-zookeeper") FooService fooZookeeper, @Qualifier("foo-simple") FooService fooSimple) {
        this.fooServiceMulti = fooMulti;
        this.fooServiceZookeeper = fooZookeeper;
        this.fooServiceSimple = fooSimple;
    }

    public void display(){
        System.out.println("**********************************");
        System.out.println(fooServiceMulti.getFoo());
        System.out.println("**********************************");
        System.out.println(fooServiceZookeeper.getFoo());
        System.out.println("**********************************");
        System.out.println(fooServiceSimple.getFoo());
        System.out.println("**********************************");
    }
}
