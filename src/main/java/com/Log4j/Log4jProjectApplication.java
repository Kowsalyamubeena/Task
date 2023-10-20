package com.Log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Log4jProjectApplication {
	
	static Logger logs=Logger.getLogger(Log4jProjectApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(Log4jProjectApplication.class, args);
//		BasicConfigurator.configure();
//		logs.info("Information");
//		logs.error("Error");
//		logs.warn("warring");
//		logs.fatal("critical error");
//		logs.debug("Debugging");
		
		
		PropertyConfigurator.configure("log4j.properties");
		logs.info("Information");
		logs.error("Error");
		logs.warn("warring");
		logs.fatal("critical error");
		logs.debug("Debugging");
	}

}
