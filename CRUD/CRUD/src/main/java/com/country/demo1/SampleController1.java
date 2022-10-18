package com.country.demo1;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class SampleController1 {
	@Autowired
	
	private SchoolRepo er;
	@GetMapping("/school") 
	public List<SchoolEntity> getSample(){
		ArrayList<SchoolEntity> transformedvalues=new ArrayList<SchoolEntity>();
    	for(SchoolEntity emt:er.findAll()) {
    		SchoolEntity temp=new SchoolEntity();
    		
    		temp.setSchool_name(emt.getSchool_name());
    		
    		transformedvalues.add(temp);
    	}
    	return transformedvalues;
	}

}
