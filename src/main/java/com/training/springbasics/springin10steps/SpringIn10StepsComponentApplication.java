package com.training.springbasics.springin10steps;

import com.training.springbasics.Components.ComponentDAO;
import com.training.springbasics.springin10steps.Scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.training.springbasics.Components")
public class SpringIn10StepsComponentApplication {

	//Logger
	private static Logger LOG = LoggerFactory.getLogger(SpringIn10StepsComponentApplication.class);


	public static void main(String[] args) {

		//This Application is used to explain how to use the @ComponentScan Application

		ApplicationContext applicationContext = SpringApplication.run(SpringIn10StepsComponentApplication.class, args);

		//Create various instances of the PersonDAO class

		PersonDAO person = applicationContext.getBean(PersonDAO.class);
		ComponentDAO component = applicationContext.getBean(ComponentDAO.class);

		LOG.info("{}", person);
		LOG.info("{}", person.getJdbcConnection());
		LOG.info("{}", component);
		LOG.info("{}", component.getJdbcComponent());

	}
}
