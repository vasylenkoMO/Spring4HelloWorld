package com.vasylenko.spring.domain;

/**
 * Created by vastl271nko on 08.10.16.
 */
public class HelloWorldImpl implements HelloWorld {
    public void sayHello(String name) {

        System.out.println("Hello " + name);

    }
}
