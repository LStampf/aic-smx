package at.ac.tuwien.infosys.aic11.services.rating.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

import at.ac.tuwien.infosys.aic11.dto.Rating;

@WebService(name = "RatingService", targetNamespace = "http://at.ac.tuwien.infosys.aic11.services")
public interface RatingService {

	@WebMethod(operationName = "get_rating")
	public Rating getRating(Long customerId) throws RatingException;

}