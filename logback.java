package com.expense.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class logback {
private static final Logger logger = LoggerFactory.getLogger(logback.class);

	public static void main(String[] args) {

	System.out.println("Log:");

	logger.trace("trace Log:");
	logger.debug("debug log");
	logger.info("info:");
	logger.warn("warn");
	logger.error("error");
	
	String message = "String";
	int zero = 0;
	
	try {
		logger.trace("Logging message {}", message);
		logger.info("Logging info",zero);
		int result = zero;
		System.out.println(result);
	}catch(Exception e) {
		logger.trace("Trace message", zero, e);
	}
	}

}
