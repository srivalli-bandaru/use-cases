package com.example.insurance.demo3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SampleController {
	@Autowired
	private InsuranceRepo ir;
	@GetMapping("/details")
	public List<InsuranceEntity> getSample7() {
		return ir.findvalues();
	}
	
}