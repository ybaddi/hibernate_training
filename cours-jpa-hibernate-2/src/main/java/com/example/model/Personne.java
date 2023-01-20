package com.example.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.hibernate.annotations.Formula;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Personne {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int num;
	private String nom;
	private String prenom;
	private LocalDate datenaissence;
	
	@Formula(value = "TIMESTAMPDIFF(YEAR,datenaissence,CURDATE())")
	private int age;
	
	public Personne() {
//		super();
		//TODO Auto-generated constructor stub
	}
	public Personne(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	
	
	public LocalDate getDatenaissence() {
		return datenaissence;
	}
	public void setDatenaissence(LocalDate datenaissence) {
		this.datenaissence = datenaissence;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Personne [num=" + num + ", nom=" + nom + ", prenom=" + prenom + ", datenaissence=" + datenaissence
				+ ", age=" + age + "]";
	}
	
	
	
	
	
}
