package com.by.learn.addressbook;

import java.util.ArrayList;
import java.util.List;


public class AddressBookMain {
	
	public static void main(String[] args) {
		System.out.println("Welcome to Addressbook Program");
		
		// UC1 ->  Ability to create new cotnact or get the default contact from the  Addressbook
		List<Contact> addressBook= new ArrayList<Contact>(AddressSupplier.addressSupplierList.get());
		
		// Ability to create multiple address book
		//List<Contact> addressBook1= new ArrayList<Contact>(AddressSupplier.addressSupplierList.get());
		//List<Contact> addressBook2= new ArrayList<Contact>(AddressSupplier.addressSupplierList.get());
		Contact cnt1=AddressBook.createContact(2021121616, "Amit", "Khandey", "32 Church Street", "Bangalore", "KA","560200","at@by.com", "9090909090");
	
		System.out.println(" \n Created Contact -> "+ cnt1.toString());
		// UC2 ,  --> Ability to add new contact to address book ,
		// UC7 --> abilty to ensure no duplicate entry for person with same name
		addressBook=AddressBook.addContactToAddressBook(addressBook,cnt1);
		System.out.println(" ****** UC2 - End **********");
		
		// UC5 --> Ability to add multiple contact to address book
		Contact cnt2=AddressBook.createContact(2021121607, "Navya", "Mahalwar", "32 Church Street", "Delhi", "Delhi","560200","at@by.com", "9090909090");
		addressBook=AddressBook.addContactToAddressBook(addressBook,cnt2);
	
		Contact cnt3=AddressBook.createContact(2021121608, "Partha", "Verma", "32 Church Street", "Pune", "MH","560200","at@by.com", "9090909090");
		addressBook=AddressBook.addContactToAddressBook(addressBook,cnt3);
		
		System.out.println("\n  Contacts after multiple contact addition -> " );
		for (Contact contact : addressBook) {
		    System.out.println(contact.toString()); 
		}
		// UC3 -> Ability to update existing contact city by  using their first name
		List<Contact> updatedContact=AddressBook.updateContactByName(addressBook,"Amit","Patna");
		System.out.println(" Updated Contacts ::\n"+updatedContact.toString());
		
		// UC4 -> Ability to delete existing contact city by  using their name
		System.out.println(" \n Addressbook Before deleting Amit-->\n " +addressBook.size());
		addressBook=AddressBook.deleteContactByName(addressBook, "Amit");
		System.out.println(" \n Addressbook after deleting Amit--> \n " +addressBook.size());
		
		// UC9,UC10 -> Ability to view contact by city ,  state and total count by city,state
		List<Contact> addressBook1= new ArrayList<Contact>(AddressSupplier.addressSupplierList.get());
		addressBook=AddressBook.getAllContactByCity(addressBook, "Bangalore");
		System.out.println("Person in Bangalore -> " );
		for (Contact contact : addressBook) {
		    System.out.print( contact.getFirstName() + " , "); 
		}
		System.out.println("\nTotal Contact in city Bangalore--> " +addressBook.size() + " --> ");
		
		addressBook=AddressBook.getAllContactByState(addressBook1, "KA");
		System.out.println("Person in KA State -> " );
		for (Contact contact : addressBook) {
		    System.out.print( contact.getFirstName() + " , "); 
		}
		System.out.println("\nTotal Contact in state KA --> " +addressBook.size());

	}

}
