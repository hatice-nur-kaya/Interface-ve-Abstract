package Adapters;

import java.rmi.RemoteException;

import Abstract.CustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.*;

public class MernisServiceAdapter implements CustomerCheckService{
	@Override
	public boolean checkIfRealPerson(Customer customer) {
		KPSPublicSoap client = new KPSPublicSoapProxy();
		boolean result = false;
		try {
			result = client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()), 
												customer.getFirstName().toUpperCase(), 
												customer.getLastName().toUpperCase(), 
												Integer.parseInt(customer.getDateOfBirth()));
												//customer.getDateOfBirth().getYear()
		} catch (NumberFormatException | RemoteException e) {
				e.printStackTrace();
		}
		return result;
	}
	
}