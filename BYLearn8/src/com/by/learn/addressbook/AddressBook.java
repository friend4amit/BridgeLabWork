package com.by.learn.addressbook;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class AddressBook {
	
	public static Predicate<Contact> getNamePredicate(String fName) {
		Predicate<Contact> prdContactName = (obj) ->{ 
			 return obj.getFirstName().equalsIgnoreCase(fName);};
		return prdContactName;
	}
	public static Predicate<Contact> getCityPredicate(String city) {
		Predicate<Contact> prdContactCity = (obj) ->{ 
			 return obj.getCity().equalsIgnoreCase(city);};
		return prdContactCity;
	}
	private static Predicate<? super Contact> getStatePredicate(String state) {
		Predicate<Contact> prdContactState = (obj) ->{ 
			 return obj.getState().equalsIgnoreCase(state);};
		return prdContactState;
	}

	public static Contact createContact(int id,String fName,String lName,String  addressline1,String city,String state,String zipcode,String email,String phoneNumber){
		Contact newContact=AddressSupplier.contactSupplier.get();
		newContact.setId(id);
		newContact.setFirstName(fName);
		newContact.setLastName(lName);
		newContact.setAddressLine1(addressline1);
		newContact.setCity(city);
		newContact.setState(state);
		newContact.setZipcode(zipcode);
		newContact.setEmail(email);
		newContact.setPhoneNumber(phoneNumber);
		
		return newContact;
	}
	
	public static List<Contact> addContactToAddressBook(List<Contact> addressBook,Contact contactToAdd) {
		List<Contact> addressBookByName=addressBook.stream().filter(getNamePredicate(contactToAdd.getFirstName())).collect(Collectors.toList());
		if(addressBookByName.size()>=1)
		{
			System.out.println("Contact already exist" );
		}else {
			addressBook.add(contactToAdd);
				
		}
		return addressBook;
	}
	
	
	
	public static List<Contact> updateContactByName(List<Contact> addressBook,String name,String city) {
			 
		List<Contact> addressBookByName=addressBook.stream().filter(getNamePredicate(name)).collect(Collectors.toList());
		addressBookByName.forEach((s)->{s.setCity(city);});
		return addressBookByName;
	}
	
	public static List<Contact> deleteContactByName(List<Contact> addressBook,String fName) {
		return addressBook.stream().filter(getNamePredicate(fName).negate()).collect(Collectors.toList());
			
	}
	
	public static List<Contact> getAllContactByCity(List<Contact> addressBook,String city) {
		return addressBook.stream().filter(getCityPredicate(city)).collect(Collectors.toList());
	
	}
	public static List<Contact> getAllContactByState(List<Contact> addressBook, String state) {
		
		return addressBook.stream().filter(getStatePredicate(state)).collect(Collectors.toList());
	}
	
}
