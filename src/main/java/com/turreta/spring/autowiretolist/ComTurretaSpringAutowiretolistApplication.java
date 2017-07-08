package com.turreta.spring.autowiretolist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ComTurretaSpringAutowiretolistApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(
				ComTurretaSpringAutowiretolistApplication.class, args);


		DepartmentBean dept = context.getBean("departmentBean", DepartmentBean.class);

		for(PersonBean person: dept.getListOfPersons())
		{
			System.out.println(person.toString());
		}
	}
}
