package com.xmlconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        System.out.println("Application Context Created");
        Alien alien1 = (Alien)context.getBean("alien1");
        Alien alien2 = (Alien)context.getBean("alien1");
        System.out.println(alien1.getAge()+" "+alien2.getAge());
//        System.out.println(alien1==alien2);
//        Laptop laptop1 = (Laptop)context.getBean("laptop1");
//        Laptop laptop2 = (Laptop)context.getBean("laptop1");
//        System.out.println(laptop1==laptop2);
        alien1.code();

    }
}
