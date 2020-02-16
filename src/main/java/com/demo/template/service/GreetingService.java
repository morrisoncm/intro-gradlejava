package com.demo.template.service;

import com.demo.template.domain.HelloWorld;
import com.demo.template.domain.User;

public interface GreetingService {

	HelloWorld sayHelloWorld();

	HelloWorld sayHelloWorldToUser(User user);
}
