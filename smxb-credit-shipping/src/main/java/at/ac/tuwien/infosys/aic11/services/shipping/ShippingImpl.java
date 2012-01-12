package at.ac.tuwien.infosys.aic11.services.shipping;

import java.util.logging.Logger;

import at.ac.tuwien.infosys.aic11.dto.Offer;
import at.ac.tuwien.infosys.aic11.legacy.interfaces.IShippingLegacy;

public class ShippingImpl implements Shipping {    
	private static final Logger LOGGER = Logger.getLogger(ShippingImpl.class
			.getName());
	private IShippingLegacy shippingService;

	@Override
	public Offer shipContract(Offer offer) throws ShippingException {
		LOGGER.info("was called with offer " + offer.getOfferId());
		try {
			shippingService.writeAndshipContract(offer);
		} catch (InterruptedException e) {
			throw new ShippingException(
					"The contract was lost during shipping!");
		}
		LOGGER.info("returned with offer " + offer.getOfferId());
		return offer;
	}
	
	public void setShippingService(IShippingLegacy shippingService) {
	    this.shippingService = shippingService;
	}

}
