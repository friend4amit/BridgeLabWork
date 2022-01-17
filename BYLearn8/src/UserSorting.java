import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class UserSorting {
	public static void main(String[] args) {
		List <UserContact> listUserContact=	UserSupplier.userSupplierList.get().stream()
				.sorted(Comparator.comparing(UserContact::getFirstName)).collect(Collectors.toList());
	System.out.println(listUserContact);	
	}

}
