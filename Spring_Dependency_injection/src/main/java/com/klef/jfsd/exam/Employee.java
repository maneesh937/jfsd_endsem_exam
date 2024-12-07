

package com.klef.jfsd.exam;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.*;

// Employee class demonstrating Constructor Dependency Injection
class Employee {
    private Integer employeeId;
    private String name;
    private Double salary;
    private String department;
    private List<String> skills;

    public Employee(Integer employeeId, String name, Double salary, String department, List<String> skills) {
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
        this.department = department;
        this.skills = skills;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                ", skills=" + skills +
                '}';
    }
}
