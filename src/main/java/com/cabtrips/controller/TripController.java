package com.cabtrips.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.data.domain.Pageable;
import com.cabtrips.entity.Trip;
import com.cabtrips.service.TripService;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/trip/v1/")
public class 	TripController {

	@Autowired
	TripService tripService;

	@GetMapping("/countRecords")
	public ResponseEntity<Mono<Long>> countAllRecords() {
		return ResponseEntity.ok(this.tripService.countAllRecords());
	}

	@GetMapping("/countCity/{city}")
	public ResponseEntity<Mono<Long>> countByCity(@PathVariable("city") String city) {
		return ResponseEntity.ok(this.tripService.countByCityName(city));
	}

	@GetMapping("/countCountry/{country}")
	public ResponseEntity<Mono<Long>>countByCountry(@PathVariable("country") String country) {
		return ResponseEntity.ok(this.tripService.countByCountryName(country));
	}

	@PostMapping("/saveRecord")
	public ResponseEntity<Mono<Trip>> saveOne(@RequestBody Trip trip) {
		return ResponseEntity.ok(this.tripService.saveOne(trip));
	}

	@PutMapping("/updateRecord/{id}")
	public ResponseEntity<Mono<Trip>> updateOne(@PathVariable("id") String id, @RequestBody Trip trip) throws Exception {
		return ResponseEntity.ok(this.tripService.updateOne(id, trip));
	}

	@GetMapping("/currentRecords/{status}/{page}/{size}")
	public ResponseEntity<Flux<Trip>> findCurrentRecords(
			@PathVariable("status") String status,
			@PathVariable("page") int page, 
			@PathVariable("size") int size) {
		Pageable pageable = PageRequest.of(page, size);
		return ResponseEntity.ok(this.tripService.findCurrentRecords(status, pageable));
	}

}
