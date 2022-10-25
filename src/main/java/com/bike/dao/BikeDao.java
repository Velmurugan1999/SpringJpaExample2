package com.bike.dao;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.bike.model.Bike;
import com.bike.model.Features;

public class BikeDao {
	static EntityManagerFactory entityfactory=Persistence.createEntityManagerFactory("persistence");
	static EntityManager manager=entityfactory.createEntityManager();
	Scanner sc=new Scanner(System.in);
	public void printall() {
		System.out.println("Hi");
		List<Bike> list=manager.createQuery("select e from Bike e").getResultList();
		if(list==null)
			System.out.println("No data found");
		else
		{
			list.forEach(b->System.out.println(b.toString()));
			System.out.println();
		}
	}
	public void end() {
		sc.close();
		manager.close();
		entityfactory.close();
	}
	public void insert() {
		manager.getTransaction().begin();
		System.out.println("Enter the company, model, colour,features id, breaking, cc, mileage, topspeed");
		Bike bike=new Bike();
		Features features=new Features();
		bike.setCompany(sc.nextLine());
		bike.setModel(sc.nextLine());
		bike.setColour(sc.nextLine());
		features.setF_id(Integer.parseInt(sc.nextLine()));
		features.setBreaking(sc.nextLine());
		features.setCc(Integer.parseInt(sc.nextLine()));
		features.setMileage(Double.parseDouble(sc.nextLine()));
		features.setTopspeed(Integer.parseInt(sc.nextLine()));
		bike.setFeatures(features);
		manager.persist(bike);
		manager.getTransaction().commit();
		System.out.println("Inserted successfully!!");
	}
	public void delete() {
		System.out.println("Enter the ID to delete");
		int id=Integer.parseInt(sc.nextLine());
		manager.getTransaction().begin();
		Bike b=manager.find(Bike.class, id);
		if(b!=null)
		{
			manager.remove(b);
			System.out.println("Removed successfully");
		}
		else
			System.out.println("No record found");
		manager.getTransaction().commit();
	}
	
	public void getbyId() {
		System.out.println("Enter the ID");
		int id=Integer.parseInt(sc.nextLine());
		Bike b=manager.find(Bike.class, id);
		if(b!=null)
			System.out.println(b.toString());
		else
			System.out.println("No record found");
	}
}
