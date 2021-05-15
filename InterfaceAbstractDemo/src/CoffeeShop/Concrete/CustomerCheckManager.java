package CoffeeShop.Concrete;


import CoffeeShop.Abstract.CustomerCheckService;
import CoffeeShop.Entity.Customer;


public class CustomerCheckManager  implements CustomerCheckService{
	@Override
	public boolean checkIfRealPerson(Customer customer) {
	
		return false;
	}


}
