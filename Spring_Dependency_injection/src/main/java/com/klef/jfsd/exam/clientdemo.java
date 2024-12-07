package com.klef.jfsd.exam;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class clientdemo {
	
	public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        // Demonstrate Constructor Dependency Injection
        Employee employee = (Employee) context.getBean("employeeBean");
        System.out.println(employee);

        // Demonstrate Autowiring with setter injection
        Course course = (Course) context.getBean("courseBean");
        System.out.println(course);
	}
}
