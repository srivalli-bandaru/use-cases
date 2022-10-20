package com.country.demo1;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

//import org.springframework.data.repository.CrudRepository;

public interface CarRepo extends JpaRepository<CarEntity ,Integer> {
 
	
@Query(value = "SELECT * from truck t Join car c ON t.no_of_tyres = c.no_of_tyres;",nativeQuery = true)
	

public List<CarEntity> getjoin();
}