package com.gulab.backend.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="driverdetails")
public class UserModel {
	
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int driverid;
	
	@Column
	private String drivername;
	@Column
	private String mobile;
	@Column
	private String experience;
	@Column
	private String currentlydriving;
	@Column
	private String bankname;
	@Column
	private String account_number;
	@Column
	private String ifsc_code;
	@Column
	private String address;
	@Column
	private String vehicle_number;
	@Column
	private String Vehicle_make;
	@Column
	private String license_number;
	@Column
	private String aadhar_number;
	@Column
	private String insurance;
	@Column
	private String preferred_area;
	@Column
	private String email;
	@Column
	private String city;
	@Column
	private String enrolled_date;
	public int getDriverid() {
		return driverid;
	}
	public void setDriverid(int driverid) {
		this.driverid = driverid;
	}
	
	public String getDrivername() {
		return drivername;
	}
	public void setDrivername(String drivername) {
		this.drivername = drivername;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	public String getCurrentlydriving() {
		return currentlydriving;
	}
	public void setCurrentlydriving(String currentlydriving) {
		this.currentlydriving = currentlydriving;
	}
	public String getBankname() {
		return bankname;
	}
	public void setBankname(String bankname) {
		this.bankname = bankname;
	}
	public String getAccount_number() {
		return account_number;
	}
	public void setAccount_number(String account_number) {
		this.account_number = account_number;
	}
	public String getIfsc_code() {
		return ifsc_code;
	}
	public void setIfsc_code(String ifsc_code) {
		this.ifsc_code = ifsc_code;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getVehicle_number() {
		return vehicle_number;
	}
	public void setVehicle_number(String vehicle_number) {
		this.vehicle_number = vehicle_number;
	}
	
	
	public String getVehicle_make() {
		return Vehicle_make;
	}
	public void setVehicle_make(String vehicle_make) {
		Vehicle_make = vehicle_make;
	}
	public String getLicense_number() {
		return license_number;
	}
	public void setLicense_number(String license_number) {
		this.license_number = license_number;
	}
	public String getAadhar_number() {
		return aadhar_number;
	}
	public void setAadhar_number(String aadhar_number) {
		this.aadhar_number = aadhar_number;
	}
	public String getInsurance() {
		return insurance;
	}
	public void setInsurance(String insurance) {
		this.insurance = insurance;
	}
	public String getPreferred_area() {
		return preferred_area;
	}
	public void setPreferred_area(String preferred_area) {
		this.preferred_area = preferred_area;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getEnrolled_date() {
		return enrolled_date;
	}
	public void setEnrolled_date(String enrolled_date) {
		this.enrolled_date = enrolled_date;
	}
	
}
