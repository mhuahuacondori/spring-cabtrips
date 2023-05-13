package com.cabtrips.entity;

import java.io.Serializable;

import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Passenger implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Field("first_name")
	private String firstName;
	@Field("last_name")
	private String lastName;

}
