package com.example.insurance.demo3;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.web.bind.annotation.PathVariable;

@Entity
@Table(name = "client1")
public class InsuranceEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private Integer id;
	private String person_name;
	private String term;
	private String Hinsurance;
	
		
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPerson_name() {
		return person_name;
	}
	public void setPerson_name(String person_name) {
		this.person_name = person_name;
	}
	public String getTerm() {
		return term;
	}
	public void setTerm(String term) {
		this.term = term;
	}
	public String getHinsurance() {
		return Hinsurance;
	}
	public void setHinsurance(String hinsurance) {
		Hinsurance = hinsurance;
	}
}