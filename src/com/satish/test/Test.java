package com.satish.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.satish.beans.Employee;
import com.satish.service.EmployeeService;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx=new  ClassPathXmlApplicationContext("/com/satish/resource/applicationContext.xml");
		Employee emp=(Employee) ctx.getBean("empBean");
		EmployeeService empService=(EmployeeService) ctx.getBean("proxy");
		empService.getEmployeeDetails(emp);
		System.out.println();
		empService.displayEmployeeDetails(emp);

	}

}
