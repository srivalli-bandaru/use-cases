package com.kpi.microservice.currencyexchangexample.demo4;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ExchangeValueRepo extends JpaRepository<ExchangeValueEntity,Integer>{
ExchangeValueEntity findByFromAndTo(String from,String to);
}
