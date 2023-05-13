package com.cabtrips.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.data.domain.Pageable;
import com.cabtrips.entity.Trip;
import com.cabtrips.service.TripService;

@RestController
@RequestMapping("/trip/v1/")
public class 	TripController {

	@Autowired
	TripService tripService;

	@GetMapping("/countRecords")
	public ResponseEntity<Long> countAllRecords() {
		return ResponseEntity.ok(this.tripService.countAllRecords());
	}

	@GetMapping("/countCity/{city}")
	public ResponseEntity<Long> countByCity(@PathVariable("city") String city) {
		return ResponseEntity.ok(this.tripService.countByCityName(city));
	}

	@GetMapping("/countCountry/{country}")
	public ResponseEntity<Long> countByCountry(@PathVariable("country") String country) {
		return ResponseEntity.ok(this.tripService.countByCountryName(country));
	}

	@PostMapping("/saveRecord")
	public void saveOne(@RequestBody Trip trip) {
		this.tripService.saveOne(trip);
	}

	@PutMapping("/updateRecord/{id}")
	public ResponseEntity<Trip> updateOne(@PathVariable("id") String id, @RequestBody Trip trip) throws Exception {
		return ResponseEntity.ok(this.tripService.updateOne(id, trip));
	}

	@GetMapping("/currentRecords/{status}/{page}/{size}")
	public ResponseEntity<List<Trip>> findCurrentRecords(
			@PathVariable("status") String status,
			@PathVariable("page") int page, 
			@PathVariable("size") int size) {
		Pageable pageable = PageRequest.of(page, size);
		return ResponseEntity.ok(this.tripService.findCurrentRecords(status, pageable));
	}

}
