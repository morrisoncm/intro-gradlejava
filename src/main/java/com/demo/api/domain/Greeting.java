package com.demo.api.domain;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class Greeting {

	private String message;

	public Greeting() {
		super();
	}

	public Greeting(String filePath, String encoding) throws IOException {
		super();
		ClassLoader classLoader = getClass().getClassLoader();
		File file = new File(classLoader.getResource(filePath).getFile());
		message = FileUtils.readFileToString(file, encoding);
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}