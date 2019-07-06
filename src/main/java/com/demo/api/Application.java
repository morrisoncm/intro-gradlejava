package com.demo.api;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.demo.api.domain.Greeting;

public class Application {

	private static final Logger LOGGER = LoggerFactory.getLogger(Application.class);

	public static void main(String args[]) {
		try {
			Greeting greeting = new Greeting("message.txt", "UTF-8");
			LOGGER.info(greeting.getMessage());
		} catch (IOException ex) {
			LOGGER.error("Application()", ex);
		}
	}
}