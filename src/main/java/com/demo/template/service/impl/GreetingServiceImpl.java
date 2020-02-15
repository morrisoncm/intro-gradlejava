package com.demo.template.service.impl;

import org.springframework.stereotype.Service;

import com.demo.template.domain.HelloWorld;
import com.demo.template.domain.User;
import com.demo.template.service.GreetingService;

@Service
public class GreetingServiceImpl implements GreetingService {

    @Override
    public HelloWorld sayHelloWorld() {
        return new HelloWorld("Hello World!");
    }

    @Override
    public HelloWorld sayHelloWorldToUser(User user) {
        String message = "Hello World to " + user.getFirstName() + " " + user.getLastName();
        return new HelloWorld(message);
    }
}
