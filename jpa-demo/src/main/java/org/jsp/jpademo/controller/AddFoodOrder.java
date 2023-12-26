package org.jsp.jpademo.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.jpademo.dto.FoodOrder;

public class AddFoodOrder {
public static void main(String[] args) {
	FoodOrder foodorder=new FoodOrder();
	foodorder.setItem_name("Biryani");
	foodorder.setPrice(200);
	foodorder.setAddress("btm");
	EntityManager manager=Persistence.createEntityManagerFactory("dev").createEntityManager();
	EntityTransaction transaction=manager.getTransaction();
	manager.persist(foodorder);
	transaction.begin();
	transaction.commit();
	
}
}
