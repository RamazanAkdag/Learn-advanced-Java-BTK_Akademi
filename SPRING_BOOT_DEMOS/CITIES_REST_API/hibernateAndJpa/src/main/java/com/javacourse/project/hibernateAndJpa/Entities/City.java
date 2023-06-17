package com.javacourse.project.hibernateAndJpa.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="city")
public class City {
	
	@Id
	@Column(name = "Id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ID;
	
	@Column(name = "Name")
	private String Name;
	
	@Column(name = "Countrycode")
	private String CountryCode;
	
	@Column(name = "District")
	private String District;
	
	@Column(name = "Population")
	private int Population;
	
	
	public City() {
		
	}
	
	
	public City(int iD, String name, String countryCode, String district, int population) {
		super();
		ID = iD;
		Name = name;
		CountryCode = countryCode;
		District = district;
		Population = population;
	}
	
	public int getID() {
		return ID;
	}


	public void setID(int iD) {
		ID = iD;
	}


	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getCountryCode() {
		return CountryCode;
	}
	public void setCountryCode(String countryCode) {
		CountryCode = countryCode;
	}
	public String getDistrict() {
		return District;
	}
	public void setDistrict(String district) {
		District = district;
	}
	public int getPopulation() {
		return Population;
	}
	public void setPopulation(int population) {
		Population = population;
	}
	
}
