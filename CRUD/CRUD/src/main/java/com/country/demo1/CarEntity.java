package com.country.demo1;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "car")
public class CarEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String car_name;
	private int no_of_tyres;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCar_name() {
		return car_name;
	}
	public void setCar_name(String car_name) {
		this.car_name = car_name;
	}
	public int getNo_of_tyres() {
		return no_of_tyres;
	}
	public void setNo_of_tyres(int no_of_tyres) {
		this.no_of_tyres = no_of_tyres;
	}
	
	
	
	}