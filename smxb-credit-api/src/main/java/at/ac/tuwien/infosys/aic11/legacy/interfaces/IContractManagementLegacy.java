package at.ac.tuwien.infosys.aic11.legacy.interfaces;

import at.ac.tuwien.infosys.aic11.dto.CreditRequest;
import at.ac.tuwien.infosys.aic11.dto.Offer;
import at.ac.tuwien.infosys.aic11.legacy.exceptions.OfferDoesNotExistException;

public interface IContractManagementLegacy {

	public Offer generateOffer(CreditRequest creditRequest);

	public void acceptOffer(Offer offer) throws OfferDoesNotExistException;

	public void declineOffer(Offer offer) throws OfferDoesNotExistException;

	public void updateOffer(Offer offer) throws OfferDoesNotExistException;

}