package org.jsp.jpademo.controller;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.jsp.jpademo.dto.User;

public class VerifyUser {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter your Email");
	int id=s.nextInt();
	System.out.println("Enter your password");
	EntityManager manager=Persistence.createEntityManagerFactory("dev").createEntityManager();
	EntityTransaction transaction=manager.getTransaction();
	String  qry="select u from User u where u.email=?1 and u.password=?2";
	Query q=manager.createQuery(qry);
	q.setParameter(1, "email");
	q.setParameter(2, "password");
	List<User> users=q.getResultList();
	if(u!=null) {
		System.out.println(u);
	}else {
		System.out.println("Enter Invalid Email or password");
	}
	
	
}
}
