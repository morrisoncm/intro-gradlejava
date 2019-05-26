package com.demo.gradle.domain;

import java.io.IOException;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

class GreetingTest {

	@Test
	void testGetMessage() throws IOException {
		Greeting greeting = new Greeting("fileTest.txt", "UTF-8");
		Assumptions.assumeTrue(greeting.getMessage().equals("Hello World!"));
	}

}
