package com.rspatil.propertiesdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.rspatil.propertiesdemo.bean.DataSource;

@Configuration
//@PropertySource("classpath:my-datasource.properties")
public class CustomConfiguration {

	@Bean
	public DataSource myDatasource(@Value("${mydatasource.username}") String username, @Value("${mydatasource.password}") String password)
	{		
		DataSource dataSource = new DataSource();
		dataSource.setUsername(username);
		dataSource.setPassword(password);
		System.out.println(dataSource);
		return dataSource;
	}
}
