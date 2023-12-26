package org.jsp.jpademo.controller;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.jpademo.dto.FoodOrder;

public class UpdateFoodOrder {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your ID to update");
	int id=sc.nextInt();
	System.out.println("Enter item_name, price, address");
	String item_name=sc.next();
	double price=sc.nextDouble();
	String address=sc.next();
	FoodOrder foodorder=new FoodOrder();
	foodorder.setId(id);
	foodorder.setItem_name(item_name);
	foodorder.setPrice(price);
	foodorder.setAddress(address);
	EntityManager manager=Persistence.createEntityManagerFactory("dev").createEntityManager();
	EntityTransaction transaction=manager.getTransaction();
	manager.merge(foodorder);
	transaction.begin();
	transaction.commit();
}
}
