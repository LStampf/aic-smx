package at.ac.tuwien.infosys.aic11.services.rating;

import java.util.logging.Logger;

import at.ac.tuwien.infosys.aic11.dto.Rating;
import at.ac.tuwien.infosys.aic11.legacy.exceptions.CustomerDoesNotExistException;
import at.ac.tuwien.infosys.aic11.legacy.interfaces.IRatingLegacy;

public class RatingImpl implements
        at.ac.tuwien.infosys.aic11.services.rating.Rating {

    private static Logger LOGGER = Logger.getLogger(RatingImpl.class.getName());
    private IRatingLegacy ratingLegacy;

    @Override
    public Rating getRating(Long customerId) throws RatingException {
        LOGGER.info("Method getRating() called with id: " + customerId);

        Rating r;
        try {
            r = ratingLegacy.getRatingForCustomer(customerId);
            LOGGER.info("Customer(" + customerId + ") has rating "
                    + r.getCustomerRating());
            return r;
        } catch (CustomerDoesNotExistException e) {
            LOGGER.severe("No customer(" + customerId + ") found.");
            throw new RatingException(e);
        }
    }
    
    public void setRatingLegacy(IRatingLegacy ratingLegacy) {
        this.ratingLegacy = ratingLegacy;
    }
}