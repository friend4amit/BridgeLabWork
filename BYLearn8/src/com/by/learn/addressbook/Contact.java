package com.by.learn.addressbook;

public class Contact {

	private int id;
	private String firstName;
	private String lastName;
	private String addressLine1;
	private String city;
	private String state;
	private String zipcode;
	private String phoneNumber;
	private String email;
	
	public Contact() {
		
	}
	public Contact(int id, String firstName, String lastName,String addressLine1, String city, String state, String zipcode,
			String phoneNumber, String email) {
		super();
		this.setId(id);
		this.firstName = firstName;
		this.lastName = lastName;
		this.setAddressLine1(addressLine1);
		this.email = email;
		this.city = city;
		this.state = state;
		this.setPhoneNumber(phoneNumber);
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String getAddressLine1() {
		return addressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	
	
  	@Override
	public String toString() {
		return "AddressBook [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", address=" + addressLine1 + ", city=" + city + ", state=" + state + ", phoneNumber=" + phoneNumber + "]";
	}
	
}
