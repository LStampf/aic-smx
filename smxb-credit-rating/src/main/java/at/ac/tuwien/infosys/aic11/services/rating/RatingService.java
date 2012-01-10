package at.ac.tuwien.infosys.aic11.services.rating;

import java.util.logging.Logger;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import at.ac.tuwien.infosys.aic11.dto.Rating;
import at.ac.tuwien.infosys.aic11.legacy.exceptions.CustomerDoesNotExistException;
import at.ac.tuwien.infosys.aic11.legacy.interfaces.IRatingLegacy;

@Path("/ratingservice/")
public class RatingService {

    private static Logger LOGGER = Logger.getLogger(RatingService.class.getName());
    private IRatingLegacy ratingLegacy;

    @GET
    @Path("customer/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Rating getRating(@PathParam("id") Long customerId) throws RatingException {
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
