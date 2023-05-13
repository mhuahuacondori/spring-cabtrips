package com.cabtrips.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.cabtrips.entity.Trip;

public interface TripRepository extends MongoRepository<Trip, String> {

	long countByCityName(String city);

	long countByCountryName(String country);

	@Query("{ 'status' : ?0  }")
	List<Trip> findCurrentRecords(String status, Pageable pageable);

}
