package com.country.demo1;

import java.util.List;
//import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;



@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepo er;
	@GetMapping("/sample2") 
	public List<EmployeeEntity> getSample(){
		return (List<EmployeeEntity>) er.findAll();
}
}

