package CoffeeShop.Abstract;

import CoffeeShop.Entity.Customer;

public abstract class BaseCustomerManager implements CustomerService{

	@Override
	public void save(Customer customer) {
		System.out.println("veritabanưna kaydedildi" + customer.getFirstName());
		
		
	}



}
