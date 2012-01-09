package at.ac.tuwien.infosys.aic11.legacy.interfaces;

import at.ac.tuwien.infosys.aic11.dto.Rating;
import at.ac.tuwien.infosys.aic11.legacy.exceptions.CustomerDoesNotExistException;

public interface IRatingLegacy {

	public Rating getRatingForCustomer(Long id)
			throws CustomerDoesNotExistException;

}