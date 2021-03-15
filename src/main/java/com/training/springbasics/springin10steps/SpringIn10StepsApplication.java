package com.training.springbasics.springin10steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringIn10StepsApplication {

	public static void main(String[] args) {

		//To execute the inversion of control from the classes to the Spring framework, we have to defined three things:
//		1. what are the Beans? Use @Component
//		2. What are the dependencies? Use @Autowired
//		3. Where to look for beans? Defined the application context Beans

		//As the Framework will managed the workflow the following lines are not necessary
//		BinarySearch bSearch = new BinarySearch(new BubbleSort());

		//It's necessary define what's  the application context (Where to look for beans)
		ApplicationContext applicationContext = SpringApplication.run(SpringIn10StepsApplication.class, args);
		BinarySearch bSearch = applicationContext.getBean(BinarySearch.class);
		System.out.println(bSearch.search(new int[]{15, 48, 9}, 3));

	}
}
