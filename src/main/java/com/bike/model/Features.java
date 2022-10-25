package com.bike.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="features")
public class Features {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int f_id;
	private String breaking;
	private double mileage;
	private int cc;
	private int topspeed;
	/*@OneToOne(mappedBy = "features")
	private Bike bike;*/
	
	public Features() {
		
	}
	public Features(int f_id, String breaking, double mileage, int cc, int topspeed) {
		this.f_id = f_id;
		this.breaking = breaking;
		this.mileage = mileage;
		this.cc = cc;
		this.topspeed = topspeed;
	}
	public int getF_id() {
		return f_id;
	}
	public void setF_id(int f_id) {
		this.f_id = f_id;
	}
	public String getBreaking() {
		return breaking;
	}
	public void setBreaking(String breaking) {
		this.breaking = breaking;
	}
	public double getMileage() {
		return mileage;
	}
	public void setMileage(double mileage) {
		this.mileage = mileage;
	}
	public int getCc() {
		return cc;
	}
	public void setCc(int cc) {
		this.cc = cc;
	}
	public int getTopspeed() {
		return topspeed;
	}
	public void setTopspeed(int topspeed) {
		this.topspeed = topspeed;
	}
	@Override
	public String toString() {
		return "\n			Features::"+this.getBreaking()+"   "+this.getCc()+"cc  "+this.getMileage()+"   "+this.getTopspeed();
	}
}
