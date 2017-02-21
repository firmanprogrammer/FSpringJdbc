package com.belajarspring.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.belajarspring.dao.CustomerDao;
import com.belajarspring.model.Customer;

/**
 * Hello world!
 *
 */
public class App {
	
	private static ApplicationContext context;
	
    public static void main( String[] args ){
    	
    	context = new ClassPathXmlApplicationContext("Main.xml");
		CustomerDao customerDAO = (CustomerDao) context.getBean("customerDAO");

		customerDAO.insert(new Customer(1, "Russell Banks", "5160 Haas Junction", "rbanks0@seesaa.net") );
		customerDAO.insert(new Customer(2, "Tina Peters", "0023 Mandrake Pass", "tpeters1@rambler.ru") );
		customerDAO.insert(new Customer(3, "Jeremy Ward", "6230 Kenwood Circle", "jward2@skyrock.com") );

		Customer customer1 = customerDAO.findByCustomerId(1);
		System.out.println(customer1);
		
        System.out.println( "Hello World!" );
    }
}
