package at.ac.tuwien.infosys.aic11.services.contract;

import javax.xml.ws.WebFault;

@SuppressWarnings("serial")
@WebFault(name = "ContractManagementException", targetNamespace = "http://at.ac.tuwien.infosys.aic11.services")
public class ContractManagementException extends Exception {
	public ContractManagementException(Throwable t) {
		super(t);
	}

	public ContractManagementException(String msg) {
		super(msg);
	}
}
