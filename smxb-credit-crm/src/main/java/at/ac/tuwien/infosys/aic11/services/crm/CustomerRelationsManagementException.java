package at.ac.tuwien.infosys.aic11.services.crm;

import javax.xml.ws.WebFault;

@SuppressWarnings("serial")
@WebFault(name = "CustomerRelationsManagementException", targetNamespace = "http://at.ac.tuwien.infosys.aic11.services")
public class CustomerRelationsManagementException extends Exception {

	public CustomerRelationsManagementException(Throwable t) {
		super(t);
	}

	public CustomerRelationsManagementException(String msg) {
		super(msg);
	}

}
