package at.ac.tuwien.infosys.aic11.legacy.exceptions;

@SuppressWarnings("serial")
public class CustomerAlreadyExistsException extends Exception {
	public CustomerAlreadyExistsException(String msg) {
		super(msg);
	}
}
