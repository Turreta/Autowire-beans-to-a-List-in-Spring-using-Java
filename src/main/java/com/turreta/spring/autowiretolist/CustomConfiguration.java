package com.turreta.spring.autowiretolist;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

/**
 * Created by Turreta.com on 8/7/2017.
 */
@Configuration
public class CustomConfiguration
{
	@Bean
	@Order(1)
	public PersonBean a() {
		return new PersonBean("1", "Duterte", "Rodrigo");
	}

	@Bean
	@Order(2)
	public PersonBean b() {
		return new PersonBean("2", "Dela Rosa", "Ronald");
	}

	@Bean
	@Order(3)
	public PersonBean c() {
		return new PersonBean("3", "Poe", "Grace");
	}

	@Bean
	@Order(4)
	public PersonBean d() {
		return new PersonBean("4", "Ko", "Bong");
	}
}
