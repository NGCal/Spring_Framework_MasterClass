package com.training.springbasics.springin10steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringIn10StepsApplication {

	public static void main(String[] args) {

		//I have to defined what sort I want to use when I  create my BinarySearch object.
		// If I want to change my sorting algorithm  I just have to change this line of the code.
		BinarySearch bSearch = new BinarySearch(new BubbleSort());


		System.out.println(bSearch.search(new int[]{15, 48, 9}, 3));

		//SpringApplication.run(SpringIn10StepsApplication.class, args);
	}
}
