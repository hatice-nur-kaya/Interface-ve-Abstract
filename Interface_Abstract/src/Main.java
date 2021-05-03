import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		Customer customerNero = new Customer(1, "Hatice Nur","KAYA", "26Temmuz","12345678915");
		
		BaseCustomerManager baseCustomerManager1 = new StarbucksCustomerManager(new MernisServiceAdapter());
		baseCustomerManager1.Save(customerNero);
		
		
	
	}

}
