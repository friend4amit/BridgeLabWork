package com.by.learn.addressbook;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;


public class AddressSupplier {
	
	public static Supplier<Contact> contactSupplierDefault = () -> {
		return  new Contact(2021121610, "Amit", "Tamrakar", "32 Church Street", "Bangalore", "KA","560200","at@by.com", "9090909090" );
    };
    
    public static Supplier<Contact> contactSupplier = () -> {
		return  new Contact();
    };
  
     public static  Supplier<List<Contact>> addressSupplierList = () -> {
    	Contact address1 =  new Contact(2021121601, "Amit", "Tamrakar", "32 Church Street", "Bangalore", "KA","560200","at@by.com", "9090909090" );
    	Contact address2 =   new Contact(2021121602, "Vikas", "Malhotra", "32 Church Street", "Hasan", "KA","560200","at@by.com", "9090909090" );
   
    	Contact address3 =  new Contact(2021121603, "Bharath", "Dhanya", "32 Church Street", "Bangalore", "KA","560200","at@by.com", "9090909090" );
    	Contact address4 =   new Contact(2021121604, "Guru", "Shetty", "32 Church Street", "Bangalore", "KA","560200","at@by.com", "9090909090" );

    	Contact address5 =  new Contact(2021121605, "Zammer", "Khan", "32 Church Street", "Bangalore", "KA","560200","at@by.com", "9090909090" );
    	Contact address6 =   new Contact(2021121606, "Deepak", "Mishra", "32 Church Street", "Bangalore", "KA","560200","at@by.com", "9090909090" );
    
        List<Contact> addressList = Arrays.asList(address1,address2,address3,address4,address5,address6);
        return addressList;
    };

    
}
