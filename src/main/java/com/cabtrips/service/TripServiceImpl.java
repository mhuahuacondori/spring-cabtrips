package com.cabtrips.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import com.cabtrips.entity.End;
import com.cabtrips.entity.Trip;
import com.cabtrips.repository.TripRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class TripServiceImpl implements TripService {

	@Autowired
	TripRepository tripRepository;

	@Override
	public void saveOne(Trip trip) {
		this.tripRepository.save(trip);
	}

	@Override
	public Trip updateOne(String id, Trip trip) throws Exception {
		Optional<Trip> tripOptional = this.tripRepository.findById(id);

		if (tripOptional.isPresent()) {
			Trip tripItem = tripOptional.get();
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
			this.tripRepository.save(tripItem);
			return tripItem;
		} else {
			throw new Exception("Registro no encontrado con id " + id);
		}
	}

	@Override
	public long countByCityName(String city) {
		return this.tripRepository.countByCityName(city);
	}

	@Override
	public long countByCountryName(String country) {
		return this.tripRepository.countByCountryName(country);
	}

	@Override
	public long countAllRecords() {
		return this.tripRepository.count();
	}

	@Override
	public List<Trip> findCurrentRecords(String status, Pageable pageable) {
		return this.tripRepository.findCurrentRecords(status,pageable);
	}

}
