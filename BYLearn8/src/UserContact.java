public class UserContact {

	private String firstName;
	private String lastName;
	private String addressLine1;
	private String phoneNumber;
		
	public UserContact() {
		
	}
	public UserContact(String firstName, String lastName,String addressLine1, String phoneNumber) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.setAddressLine1(addressLine1);
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
		return "AddressBook [firstName=" + firstName + ", lastName=" + lastName 
				+ addressLine1 + "phoneNumber=" + phoneNumber + "]";
	}
	
}
