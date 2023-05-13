package com.cabtrips.service;

import org.springframework.data.domain.Pageable;
import com.cabtrips.entity.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface TripService {

	Mono<Trip> saveOne(Trip trip);

	Mono<Trip> updateOne(String id, Trip trip) throws Exception;

	Mono<Long> countByCityName(String city);

	Mono<Long> countByCountryName(String country);

	Mono<Long> countAllRecords();

	Flux<Trip> findCurrentRecords(String status, Pageable pageable);
}
