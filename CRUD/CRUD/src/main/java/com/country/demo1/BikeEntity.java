package com.country.demo1;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bike")
public class BikeEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String bike_name;
	private String no_of_tyres;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getBike_name() {
		return bike_name;
	}
	public void setBike_name(String bike_name) {
		this.bike_name = bike_name;
	}
	public String getNo_of_tyres() {
		return no_of_tyres;
	}
	public void setNo_of_tyres(String no_of_tyres) {
		this.no_of_tyres = no_of_tyres;
	}
	
}