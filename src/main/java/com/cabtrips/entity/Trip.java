package com.cabtrips.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Document(collection = "trips")
public class Trip implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private String id;
    private Start start;
	private End end;
	private Country country;
	private City city;
	private Passenger passenger;
	private Driver driver;
	private Car car;
	private String status;
	@Field("check_code")
	private String checkCode;
	private CreatedAt createdAt;
	private UpdatedAt updatedAt;
	private double price;
	@Field("driver_location")
	private DriverLocation driverLocation;

}