package com.application.main;

import com.application.model.Employee;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args){
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        Employee employee = context.getBean("employee",Employee.class);
        System.out.println(employee.getUsername()+"\t"+employee.getPassword());
        context.close();
    }
}
