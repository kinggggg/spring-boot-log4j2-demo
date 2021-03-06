package com.zeek.learn.springbootlogforjtwo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootlogforjtwoApplicationTests {

	Logger logger = LoggerFactory.getLogger(SpringbootlogforjtwoApplicationTests.class);

	@Test
	public void contextLoads() {
	}

	@Test
	public void log4j2Test() {

		logger.info("info");

		String errorMsg = "error message" ;
		logger.error("error : {}", errorMsg);

	}

}

