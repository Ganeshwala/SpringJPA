package com.springjpa.main.entities;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.SequenceGenerators;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable // this annotation we not create table in ur db but we can embedded it and use
			// it as separate class which field will being used
@Data
@AllArgsConstructor
@NoArgsConstructor
/*
 * @AttributeOverrides -> annotation will use as , it will mapped the below
 * field into particular table and we also define name in that particular table
 */
@AttributeOverrides({ @AttributeOverride(name = "houseNumber", // this name should match with the name we define below
		column = @Column(name = "add_houseNumber")), @AttributeOverride(name = "streetName", // this name should match
																								// with the name we
																								// define below
				column = @Column(name = "add_streetName")),
		@AttributeOverride(name = "areaName", // this name should match with the name we define below
				column = @Column(name = "add_areaName")),
		@AttributeOverride(name = "cityName", // this name should match with the name we define below
				column = @Column(name = "add_cityName")),
		@AttributeOverride(name = "stateName", // this name should match with the name we define below
				column = @Column(name = "add_stateName")),
		@AttributeOverride(name = "countryName", // this name should match with the name we define below
				column = @Column(name = "add_countryName")),
		@AttributeOverride(name = "pingCode", // this name should match with the name we define below
				column = @Column(name = "add_pingCode")),
		@AttributeOverride(name = "addressId", // this name should match with the name we define below
		column = @Column(name = "add_addressId"))})
@Builder
public class Address {

	
	private int addressId;
	private int houseNumber;
	private String streetName;
	private String areaName;
	private String cityName;
	private String stateName;
	private String countryName;
	private String pingCode;
}
