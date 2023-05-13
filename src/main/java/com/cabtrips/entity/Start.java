package com.cabtrips.entity;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Start implements Serializable {

	private static final long serialVersionUID = 1L;

	private Date date;
	@Field("pickup_address")
	private String pickupAddress;
	@Field("pickup_location")
	private PickupLocation pickupLocation;
}
