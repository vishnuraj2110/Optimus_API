package com.crm.optimus.merchaindise;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Merchandise {
    @Id
    @GeneratedValue
    @Column(name="id")
	private long id;
    
    @Column(name="mechandise_Name")
	private String merchandise_name;
    
    @Column(name="created_on")
	private LocalDate created_on;
    
    @Column(name="price")
	private double price;
    
    @Column(name="added_by")
	private String added_by;
	
	
	public Merchandise() {}
	
	public Merchandise(long id, 
			            String merchaindise_name, 
			            LocalDate created_on, 
			            double price, 
			            String added_by) {
		super();
		this.id = id;
		this.merchandise_name = merchaindise_name;
		this.created_on = created_on;
		this.price = price;
		this.added_by = added_by;
	}

	public Merchandise(String merchaindise_name,
			            LocalDate created_on, 
			            double price, 
			            String added_by) {
		super();
		this.merchandise_name = merchaindise_name;
		this.created_on = created_on;
		this.price = price;
		this.added_by = added_by;
	}

	public long getId() {
		return id;
	}

	public String getMerchaindise_name() {
		return merchandise_name;
	}

	public LocalDate getCreated_on() {
		return created_on;
	}

	public double getPrice() {
		return price;
	}

	public String getAdded_by() {
		return added_by;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setMerchaindise_name(String merchandise_name) {
		this.merchandise_name = merchandise_name;
	}

	public void setCreated_on(LocalDate created_on) {
		this.created_on = created_on;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setAdded_by(String added_by) {
		this.added_by = added_by;
	}

	@Override
	public String toString() {
		return "Merchandise [id=" + id + ", merchandise_name=" + merchandise_name + ", created_on=" + created_on
				+ ", price=" + price + ", added_by=" + added_by + "]";
	}
	
	
	
	
}
