package com.hany.tutorials.frameworks;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Log4JSample {

	private static Logger logger = LogManager.getLogger(Log4JSample.class);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		for(int i=0; i < 501; i++) {
			logger.info("Info-"+i);	
		}
	}

}
