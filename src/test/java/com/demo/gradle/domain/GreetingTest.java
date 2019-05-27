package com.demo.gradle.domain;

import java.io.IOException;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

class GreetingTest {

	@Test
	void testGetMessage() throws IOException {
		Greeting greeting = new Greeting("message.txt", "UTF-8");
		Assumptions.assumeTrue(greeting.getMessage().equals("Hello World!"));
	}
	
	@Test
	void testGetMessageIOException() {
		Assertions.assertThrows(NullPointerException.class, () -> new Greeting("wrongFileName", "UTF-8"));
	}
}