package com.cabtrips.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.cabtrips.entity.Trip;
import com.cabtrips.repository.TripRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
@Slf4j
public class TripServiceImpl implements TripService {

	@Autowired
	TripRepository tripRepository;

	@Override
	public Mono<Trip> saveOne(Trip trip) {
		return this.tripRepository.save(trip);
	}

	@Override
	public Mono<Trip> updateOne(String id, Trip trip) throws Exception {
		return this.tripRepository.findById(id)
				.flatMap(tripItem -> {
					tripItem.setStart(trip.getStart());
					tripItem.setEnd(trip.getEnd());
					tripItem.setCountry(trip.getCountry());
					tripItem.setCity(trip.getCity());
					tripItem.setPassenger(trip.getPassenger());
					tripItem.setDriver(trip.getDriver());
					tripItem.setCar(trip.getCar());
					tripItem.setStatus(trip.getStatus());
					tripItem.setCheckCode(trip.getCheckCode());
					tripItem.setCreatedAt(trip.getCreatedAt());
					tripItem.setPrice(trip.getPrice());
					tripItem.setDriverLocation(trip.getDriverLocation());
					return this.tripRepository.save(tripItem);
				});
	}

	@Override
	public Mono<Long> countByCityName(String city) {
		return this.tripRepository.countByCityName(city);
	}

	@Override
	public Mono<Long> countByCountryName(String country) {
		return this.tripRepository.countByCountryName(country);
	}

	@Override
	public Mono<Long> countAllRecords() {
		return this.tripRepository.count();
	}

	@Override
	public Flux<Trip> findCurrentRecords(String status, Pageable pageable) {
		return this.tripRepository.findCurrentRecords(status,pageable);
	}

}
