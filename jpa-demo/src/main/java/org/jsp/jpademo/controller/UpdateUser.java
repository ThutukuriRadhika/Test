package org.jsp.jpademo.controller;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.jpademo.dto.User;

public class UpdateUser {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your ID to update the record");
	int id=sc.nextInt();
	System.out.println("Enter name, gender, email, phone and password");
   String name=sc.next();
   String gender=sc.next();
   String email=sc.next();
   long phone=sc.nextLong();
   String password=sc.next();
   User u=new User();
   u.setName(name);
   u.setGender(gender);
   u.setEmail(email);
   u.setPhone(phone);
   u.setPassword(password);
   EntityManager manager=Persistence.createEntityManagerFactory("dev").createEntityManager();
   EntityTransaction transaction=manager.getTransaction();
   manager.merge(u);
   transaction.commit();
   transaction.commit();
}
}
