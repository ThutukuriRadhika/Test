package org.jsp.jpademo.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.jpademo.dto.User;

public class SaveUser {
public static void main(String[] args) {
	User u=new User();
	u.setName("Radhi");
	u.setEmail("rad@gmail.com");
	u.setGender("male");
	u.setPhone(123);
	u.setPassword("a@123");
	EntityManagerFactory factory=Persistence.createEntityManagerFactory("dev");
	EntityManager manager=factory.createEntityManager();
	EntityTransaction transaction=manager.getTransaction();
	manager.persist(u);
	transaction.begin();
	transaction.commit();
	
	
}
}
