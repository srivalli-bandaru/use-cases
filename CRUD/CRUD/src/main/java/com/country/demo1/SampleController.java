package com.country.demo1;

import java.util.ArrayList;
//import java.util.Collection;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
	@Autowired
	private EmployeeRepo er;

	@GetMapping("/employeename") 
	public List<String> getSample(){
		ArrayList<String> transformedvalues=new ArrayList<String>();
    	for(EmployeeEntity emt:er.findAll()) {
    		String name;
    		name=emt.getEmployee_name();
    		transformedvalues.add(name);
    		
	}	
		return transformedvalues;
	}
	
	
@GetMapping("/id") 
public List<Integer> getSample2(){
	ArrayList<Integer> transformedvalues=new ArrayList<Integer>();
	for(EmployeeEntity emt:er.findAll()) {
		int id;
		id=emt.getId();
		transformedvalues.add(id);
		
}	
	return transformedvalues;
}

@GetMapping("/A") 
public List<EmployeeEntity> getSample3(){
	ArrayList<EmployeeEntity> transformedvalues=new ArrayList<EmployeeEntity>();
	for(EmployeeEntity emt:er.findAll()) {
		EmployeeEntity temp = new EmployeeEntity();
		if(emt.getEmployee_name().startsWith("a")) {
		
		temp.setId(emt.getId());
		temp.setEmployee_name(emt.getEmployee_name());
		transformedvalues.add(temp);
		}
}	
	return transformedvalues;
}
@GetMapping("/department") 
public List<String> getSample4(){
	ArrayList<String> transformedvalues=new ArrayList<String>();
	for(EmployeeEntity emt:er.findAll()) {
		String name;
		name = emt.getDepartment();
		transformedvalues.add(name);
		}
	
	return transformedvalues;
}
}