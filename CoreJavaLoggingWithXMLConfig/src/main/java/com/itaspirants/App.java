package com.itaspirants;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class App 
{
	private static final Logger logger = LogManager.getLogger(App.class);

	public static void main(final String... args) 
	{
		logger.debug("Debug Message Logged !!!");
		logger.info("Info Message Logged !!!");
		logger.error("Error Message Logged !!!", new NullPointerException("NullError"));
	}
}
