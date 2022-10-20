package com.country.demo1;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController2 {
	@Autowired
	private CarRepo cr;
	@Autowired
	private TruckRepo tr;
	
	@GetMapping("/c")
	public List<CarEntity> getSample5() {
		return cr.getjoin();
	}
	
	@GetMapping("/t")
	public List<TruckEntity> getSample6() {
		return tr.getjoin1();
	}
}
		