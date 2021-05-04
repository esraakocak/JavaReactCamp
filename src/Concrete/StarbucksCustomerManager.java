package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Entities.Customer;


public class StarbucksCustomerManager extends BaseCustomerManager{
	   
	public CustomerCheckService customerCheckService;

	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
	        this.customerCheckService = customerCheckService;
	    }
	
	@Override
	public void Save(Customer customer) {
		if(customerCheckService.CheckPerson(customer)) {
			System.out.println("Starbucks Manager : Validation successfull.");
			super.Save(customer);
		}else {
			System.out.println("Starbucks Manager : Validation Error - Not a valid person.");
		}

	}
	

}
