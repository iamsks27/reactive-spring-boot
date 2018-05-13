package com.reactive.spring.repository;

import com.reactive.spring.model.City;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends ReactiveCrudRepository<City, String> {
}
