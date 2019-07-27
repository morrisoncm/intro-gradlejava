package com.demo.api.exceptionhandler;

import java.util.ResourceBundle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class BaseEntityExceptionHandler extends ResponseEntityExceptionHandler {

	private static final Logger LOG = LoggerFactory.getLogger(BaseEntityExceptionHandler.class);
	private ResourceBundle labels = ResourceBundle.getBundle("error.messages");

	@ExceptionHandler(value = { RuntimeException.class })
	protected ResponseEntity<Object> handleConflict(Exception ex, WebRequest request) {
		
		LOG.error("Handling of [" + ex.getClass().getName() + "] resulted in Exception ", ex);
		String localizedMessage = labels.getString(ex.getMessage());	
		if (StringUtils.isEmpty(localizedMessage)) {
			localizedMessage = labels.getString("exception.unknown");
		}
		
		return handleExceptionInternal(ex, localizedMessage, new HttpHeaders(), HttpStatus.UNPROCESSABLE_ENTITY, request);
	}
}