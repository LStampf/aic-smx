package at.ac.tuwien.infosys.aic11.legacy.interfaces;

import java.util.List;

import at.ac.tuwien.infosys.aic11.dto.Customer;
import at.ac.tuwien.infosys.aic11.legacy.exceptions.CustomerAlreadyExistsException;
import at.ac.tuwien.infosys.aic11.legacy.exceptions.CustomerDoesNotExistException;

public interface ICustomerRelationsLegacy {

	public void createCustomer(Customer customer)
			throws CustomerAlreadyExistsException;

	public List<Customer> getAllCustomers();

	public Customer getCustomerById(Long id)
			throws CustomerDoesNotExistException;

}