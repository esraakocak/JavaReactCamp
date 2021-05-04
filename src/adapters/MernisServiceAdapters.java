package adapters;

import java.rmi.RemoteException;
import java.time.ZoneId;

import Abstract.CustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapters implements CustomerCheckService {

	
	@Override
	public boolean CheckPerson(Customer customer) {
		KPSPublicSoap soapClient = new KPSPublicSoapProxy();
		boolean result = false;
		  try {
			 
			 result = soapClient.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()), customer.getFirstName(), customer.getLastName(), customer.getDateOfBirth().toInstant().atZone(ZoneId.systemDefault()).toLocalDate().getYear());
			
		  } catch (NumberFormatException e) {		
             e.printStackTrace();
		  } catch (RemoteException e) {
		       e.printStackTrace();   
		  }
		
		return result;
		
	}
}
