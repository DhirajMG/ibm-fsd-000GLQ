package comm.example.spring.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import comm.example.spring.rest.Customer;
import comm.example.spring.rest.dao.CustomerDAO;
@Service
public class CustomerServiceImpl implements CustomerService{
	@Autowired
	private CustomerDAO dao;

	@Override
	public List<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
		return dao.getAllCustomer();
	}

}
