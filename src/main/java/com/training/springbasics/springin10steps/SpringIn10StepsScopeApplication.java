package com.training.springbasics.springin10steps;

import com.training.springbasics.springin10steps.Basic.BinarySearch;
import com.training.springbasics.springin10steps.Scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringIn10StepsScopeApplication {

	//Logger
	private static Logger LOG = LoggerFactory.getLogger(SpringIn10StepsScopeApplication.class);


	public static void main(String[] args) {

		//This Application is used to explain how to use scopes on Spring. The Scope package has all tools related to
		//the example

		ApplicationContext applicationContext = SpringApplication.run(SpringIn10StepsScopeApplication.class, args);

		//Create various instances of the PersonDAO class

		PersonDAO person1 = applicationContext.getBean(PersonDAO.class);
		PersonDAO person2 = applicationContext.getBean(PersonDAO.class);

		LOG.info("{}", person1);
		LOG.info("{}", person1.getJdbcConnection());
		LOG.info("{}", person2);
		LOG.info("{}", person2.getJdbcConnection());

	}
}
