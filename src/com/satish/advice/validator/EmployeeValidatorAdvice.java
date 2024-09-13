package com.satish.advice.validator;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

import com.satish.beans.Employee;

public class EmployeeValidatorAdvice implements MethodBeforeAdvice {

	@Override
	public void before(Method method, Object[] params, Object target) throws Throwable {
		  Employee emp=(Employee) params[0];
		  System.out.println("Validation Messages for "+method.getName());
		  System.out.println("==========================================");
		  if(emp.getEno()<100 || emp.getEno()>999) {
			  System.out.println("******Employee Number must be 3 digit number Only*******");
			  
		  }
		  if(emp.getEsal()<20000 || emp.getEsal()>50000) {
			  System.out.println("*******Employee Salary must be in the range from 20000 to 50000******");
			  
		  }
		  if(!emp.getEmobile().startsWith("91-")) {
			  System.out.println("********Employee Mobile Number is Invalid**********");
		  }
		  if(!emp.getEemail().endsWith("@satish.com")) {
			  System.out.println("**********Employee Emails is Invalid**********");
		  }

	}

}
