package com.bike.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="bike")
public class Bike {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bid;
	private String company;
	private String model;
	private String colour;
	@OneToOne
	@JoinColumn(name="f_id")
	private Features features;
	
	public Bike() {
		
	}
	public Bike(int bid, String company, String model, String colour, Features features) {
		super();
		this.bid = bid;
		this.company = company;
		this.model = model;
		this.colour = colour;
		this.features = features;
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public Features getFeatures() {
		return features;
	}
	public void setFeatures(Features features) {
		this.features = features;
	}
	@Override
	public String toString() {
		return this.getBid()+"  "+this.getCompany()+"  "+this.getModel()+"   "+this.getColour()+
				"   "+this.getFeatures().toString();
	}
	
}
