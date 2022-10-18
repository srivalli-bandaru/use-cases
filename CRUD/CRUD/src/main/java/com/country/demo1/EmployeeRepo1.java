package com.country.demo1;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepo1 extends JpaRepository<EmployeeEntity ,Integer> { 

}
