package at.ac.tuwien.infosys.aic11.services.rating.ws;

import javax.xml.ws.WebFault;

@SuppressWarnings("serial")
@WebFault(name = "RatingException", targetNamespace = "at.ac.tuwien.infosys.aic11.services")
public class RatingException extends Exception {

	public RatingException(Throwable t) {
		super(t);
	}
}
