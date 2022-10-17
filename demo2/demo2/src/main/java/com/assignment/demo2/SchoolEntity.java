package com.assignment.demo2;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity
@Table(name = "school")
public class SchoolEntity {

	
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private String school_name;

	public String getSchool_name() {
		return school_name;
	}

	public void setSchool_name(String school_name) {
		this.school_name = school_name;
	}
	
}
