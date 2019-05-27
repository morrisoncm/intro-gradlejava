package com.demo.gradle;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.demo.gradle.domain.Greeting;

public class Application {

	private static final Logger logger = LoggerFactory.getLogger(Application.class);

	public static void main(String args[]) {
		try {
			Greeting greeting = new Greeting("message.txt", "UTF-8");
			logger.info(greeting.getMessage());
		} catch (IOException ex) {
			logger.error("Application()", ex.getMessage(), ex);
		}
	}
}