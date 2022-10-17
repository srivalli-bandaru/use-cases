package com.assignment.demo2;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class SampleController {
	@Autowired
	
	private SchoolRepo sr;
	@GetMapping("/school") 
	public List<SchoolEntity> getSample(){
		ArrayList<SchoolEntity> transformedvalues=new ArrayList<SchoolEntity>();
    	for(SchoolEntity emt:sr.findAll()) {
    		SchoolEntity temp=new SchoolEntity();
    		
    		if(emt.getSchool_name().contains("$")) {
    			temp.setSchool_name(emt.getSchool_name().replaceAll("\\$", ""));
    		}
    		transformedvalues.add(temp);
    	}
    	return transformedvalues;
	}
}


