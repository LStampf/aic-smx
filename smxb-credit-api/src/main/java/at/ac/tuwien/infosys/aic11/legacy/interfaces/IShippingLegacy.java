package at.ac.tuwien.infosys.aic11.legacy.interfaces;

import at.ac.tuwien.infosys.aic11.dto.Offer;

public interface IShippingLegacy {

	public void writeAndshipContract(Offer offer) throws InterruptedException;

}