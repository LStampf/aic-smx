package at.ac.tuwien.infosys.aic11.legacy.internal;

import java.util.logging.Logger;

import at.ac.tuwien.infosys.aic11.dto.Offer;
import at.ac.tuwien.infosys.aic11.legacy.interfaces.IShippingLegacy;

public class ShippingLegacy implements IShippingLegacy {

	private static final Logger LOGGER = Logger
			.getLogger(ShippingLegacy.class.getName());

	public void writeAndshipContract(Offer offer) throws InterruptedException {
		LOGGER.info("begin shipping contract!");
		long seconds = 5 + Math.round(Math.random() * 10);
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			LOGGER.severe("contract was interrupted while shipping!");
			throw e;
		}
		LOGGER.info("contract was signed!");
	}

}
