package com.country.demo1;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;

public interface BikeRepo extends JpaRepository<BikeEntity ,Integer> {



}
