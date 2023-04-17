package jpa.demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Jpa {
	public static void main(String[] args) {
		
		EntityManagerFactory factory= Persistence.createEntityManagerFactory("Rasheed");
		
		EntityManager entity= factory.createEntityManager();
		

		
		entity.getTransaction().begin();
		
		Employee emp=new Employee(123, "diviya",23456, "akhila");
		
		entity.persist(emp);
		entity.getTransaction().commit();
		
		System.out.println("Data is inserted");
		
	}

}
