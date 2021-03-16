package com.training.springbasics.springin10steps;

import com.training.springbasics.springin10steps.Basic.BinarySearch;
import com.training.springbasics.springin10steps.Scope.PersonDAO;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringIn10StepsScopeApplication {

	public static void main(String[] args) {

		//This Application is used to explain how to use scopes on Spring. The Scope package has all tools related to
		//the example


		ApplicationContext applicationContext = SpringApplication.run(SpringIn10StepsScopeApplication.class, args);

		//Create various instances of the PersonDAO class

		PersonDAO person1 = applicationContext.getBean(PersonDAO.class);
		PersonDAO person2 = applicationContext.getBean(PersonDAO.class);

		System.out.println("Person1 Hash: " + person1);
		System.out.println("Person1 JDBC Hash: " + person1.getJdbcConnection());
		System.out.println("Person2 Hash: " + person2);
		System.out.println("Person2 JDBC Hash: " + person2.getJdbcConnection());

	}
}
