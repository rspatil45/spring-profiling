package com.rspatil.propertiesdemo.bean;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dog")
public class Dog implements Animal {

	@Override
	public void makeSound() {
		System.out.println("bow...");

	}

}
