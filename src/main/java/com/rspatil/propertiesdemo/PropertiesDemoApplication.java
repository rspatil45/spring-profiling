package com.rspatil.propertiesdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.rspatil.propertiesdemo.bean.Animal;
import com.rspatil.propertiesdemo.bean.Cat;

@SpringBootApplication
public class PropertiesDemoApplication implements CommandLineRunner {

	@Autowired
	Animal animal;
	
	@Value("${company.name}")
	String companey;
	
	public static void main(String[] args) {
		SpringApplication.run(PropertiesDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Company Name : "+companey);
		animal.makeSound();		
	}
	
//	@Bean
//	@Profile("cat")
//	Cat cat()
//	{
//		return new Cat();
//	}

}
