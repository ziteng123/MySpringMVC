package com.teng;

import com.teng.pojo.Employee;
import com.teng.pojo.Manager;
import com.teng.service.HelloService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloDemo {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        HelloService helloService = (HelloService) context.getBean("HelloService");
        helloService.sayHello();
        Employee e = (Employee) context.getBean("employee");
        System.out.println(e);
        Manager m = (Manager) context.getBean("manager");
        m.run();
    }
}
