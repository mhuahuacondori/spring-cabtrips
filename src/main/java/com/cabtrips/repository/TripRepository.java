package com.cabtrips.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;
import com.cabtrips.entity.Trip;
import reactor.core.publisher.Mono;

public interface TripRepository extends ReactiveMongoRepository<Trip, String> {

	Mono<Long> countByCityName(String city);

	Mono<Long> countByCountryName(String country);

	@Query("{ 'status' : ?0  }")
	Flux<Trip> findCurrentRecords(String status, Pageable pageable);

}
