package com.cabtrips.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class PickupLocation implements Serializable {

	private static final long serialVersionUID = 1L;

	private String type;
	private double[] coordinates;

}
