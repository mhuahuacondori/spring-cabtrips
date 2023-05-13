package com.cabtrips.service;

import java.util.List;
import org.springframework.data.domain.Pageable;
import com.cabtrips.entity.*;

public interface TripService {

	void saveOne(Trip trip);

	Trip updateOne(String id, Trip trip) throws Exception;

	long countByCityName(String city);

	long countByCountryName(String country);

	long countAllRecords();

	List<Trip> findCurrentRecords(String status, Pageable pageable);
}
