package com.example.insurance.demo3;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.CrudRepository;


public interface InsuranceRepo extends JpaRepository<InsuranceEntity ,Integer> {
	@Query(value = " select * from client1 where id = 1",nativeQuery=true)
	List<InsuranceEntity> findvalues();

	@Query(value = " select * from client1 where id = 2",nativeQuery=true)
	List<InsuranceEntity> findvalues1();
	
	@Query(value = " select * from client1 where term > 5;",nativeQuery=true)
	List<InsuranceEntity> findvalues2();
	
	@Query(value = " select * from client1 where term = 5;",nativeQuery=true)
	List<InsuranceEntity> findvalues3();
	
	@Query(value = " select * from client1 where id < 5",nativeQuery=true)
	List<InsuranceEntity> findvalues4();
}
