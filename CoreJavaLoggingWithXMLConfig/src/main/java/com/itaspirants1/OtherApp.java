package com.itaspirants1;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class OtherApp {
	private static final Logger logger = LogManager.getLogger(OtherApp.class);

	public static void main(final String... args) 
	{
		System.out.println("Console appender output for this file......");
		logger.debug("Debug Message Logged !!!");
		logger.info("Info Message Logged !!!");
		logger.error("Error Message Logged !!!", new NullPointerException("NullError"));
		System.out.println("Now please refer file logs/appsLog.log for output of file appender which is specific to package of this file.");
	}
}
