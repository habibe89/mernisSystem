package CoffeeShop;

import CoffeeShop.Abstract.BaseCustomerManager;
import CoffeeShop.Adapters.MernisServiceAdapter;
import CoffeeShop.Concrete.CustomerCheckManager;
import CoffeeShop.Concrete.NeroCustomerManager;
import CoffeeShop.Concrete.StarbucksCustomerManager;
import CoffeeShop.Entity.Customer;

public class Main {

	public static void main(String[] args) {
		
		
		BaseCustomerManager customerManager2 = new  StarbucksCustomerManager(new MernisServiceAdapter()); 
		customerManager2.save(new Customer(1,"habibe","baran",1997,"12345678910"));
		
		
		
	}

}
