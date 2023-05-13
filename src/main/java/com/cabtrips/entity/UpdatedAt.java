package com.cabtrips.entity;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class UpdatedAt implements Serializable {

	private static final long serialVersionUID = 1L;

	private Date date;
}
