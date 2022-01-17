import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;



public class UserSupplier {
	public static Supplier<UserContact> userSupplierDefault = () -> {
		return  new UserContact("Amit", "Tamrakar", "32 Church Street", "9090909090" );
    };
    
    public static Supplier<UserContact> userSupplier = () -> {
		return  new UserContact();
    };
  
     public static  Supplier<List<UserContact>> userSupplierList = () -> {
    	 UserContact user1 =  new UserContact("Amit", "Tamrakar", "32 Church Street", "9090909090");
      	 UserContact user2 =  new UserContact("Pranab", "Mishra", "32 Church Street", "9090909090");
      	 UserContact user3 =  new UserContact("Rahul", "Nambiar", "32 Church Street", "9090909090");
      	 UserContact user4 =  new UserContact("Guru", "Shetty", "32 Church Street", "9090909090");
      	 UserContact user5 =  new UserContact("Atul", "Bhai", "32 Church Street", "9090909090");
      	 UserContact user6 =  new UserContact("Vaibha", "Rajpoot", "32 Church Street", "9090909090");
      	      
        List<UserContact> userContactList = Arrays.asList(user6,user2,user3,user4,user5,user1);
        return userContactList;
    };
}
