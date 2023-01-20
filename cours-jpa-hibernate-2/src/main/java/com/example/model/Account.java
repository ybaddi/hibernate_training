package com.example.model;

import org.hibernate.annotations.Formula;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Account {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	private Double credit;
	
	private Double rate;
	
	@Formula(value="credit * rate")
	private Double interest;

	public Account() {
		super();
		//TODO Auto-generated constructor stub
	}

	public Account(Double credit, Double rate) {
		super();
		this.credit = credit;
		this.rate = rate;
		this.interest = interest;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Double getCredit() {
		return credit;
	}

	public void setCredit(Double credit) {
		this.credit = credit;
	}

	public Double getRate() {
		return rate;
	}

	public void setRate(Double rate) {
		this.rate = rate;
	}

	public Double getInterest() {
		return interest;
	}

	public void setInterest(Double interest) {
		this.interest = interest;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", credit=" + credit + ", rate=" + rate + ", interest=" + interest + "]";
	}
	
	

}
