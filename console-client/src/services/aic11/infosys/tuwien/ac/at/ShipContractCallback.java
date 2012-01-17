package services.aic11.infosys.tuwien.ac.at;

import java.util.concurrent.ExecutionException;
import java.util.logging.Logger;

import javax.xml.ws.AsyncHandler;
import javax.xml.ws.Response;

import dto.aic11.infosys.tuwien.ac.at.Offer;

public class ShipContractCallback implements AsyncHandler<ShipContractResponse> {

	private static final Logger LOGGER = Logger.getLogger(ShipContractCallback.class
			.getName());

	@Override
	public void handleResponse(Response<ShipContractResponse> resp) {
		try {
			Offer ret = resp.get().getReturn();
			LOGGER.info("Contract to offer " + ret.getOfferId()
					+ " returned signed, time to go on!");
		} catch (InterruptedException e) {
			LOGGER.severe(e.getMessage());
		} catch (ExecutionException e) {
			LOGGER.severe(e.getCause().getMessage());
		}

	}

}
