package Abstract;

import Entities.Customer;

public  abstract  class BaseCustomerManager implements CustomerService {
	
	@Override
	public void Save(Customer customer) {
		 System.out.println("customer succesfully added to database :"+customer.firstName);
		
	}
 

}
