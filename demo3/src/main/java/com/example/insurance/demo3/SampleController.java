package com.example.insurance.demo3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SampleController {
	@Autowired
	private InsuranceRepo ir;
	@GetMapping("/c1")
	public List<InsuranceEntity> getSample7() {
		return ir.findvalues();
	}
	
	@GetMapping("/c2")
	public List<InsuranceEntity> getSample8() {
		return ir.findvalues1();
	}
	
	@GetMapping("/greaterthan5")
	public List<InsuranceEntity> getSample9() {
		return ir.findvalues2();
}

	@GetMapping("/equalto5")
	public List<InsuranceEntity> getSample10() {
		return ir.findvalues3();
}
	
	@GetMapping("/lessthan5")
	public List<InsuranceEntity> getSample11() {
		return ir.findvalues4();
}

	
	@GetMapping("/{term}/{amount}")
	public double amount(@PathVariable String term,@PathVariable int amount) {
		
		
	if ( term.equals("greaterthan5")) {
		return (amount - (0.1*(amount)));
	}
	
	if (term.equals("equalto5") ) {
		return (amount - (0.12*(amount)));
	}
	return amount;
	}
}
