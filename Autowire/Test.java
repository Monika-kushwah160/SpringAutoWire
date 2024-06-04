package com.springProject.Autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springProject.Collection.Student;

public class Test 
{

	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springProject/Autowire/AutowireConfig.xml");
		
		    Employee emp1 = (Employee)context.getBean("emp",Employee.class);
		    System.out.println(emp1);
	}

}
