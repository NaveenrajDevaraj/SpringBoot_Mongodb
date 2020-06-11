/**
 * 
 */
package com.jsonar.service.RestService.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import com.jsonar.service.RestService.ApplicationConstants;
import com.jsonar.service.RestService.CustomerConstants;
import com.jsonar.service.RestService.model.CustomerDetails;
import com.jsonar.service.RestService.model.Rentals;
import com.jsonar.service.RestService.repository.CustomerRepository;

/**
 * @author naveenraj.devaraj
 *
 */
@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    MongoTemplate mongoTemplate;

    public List<CustomerDetails> findAllCustomer(int startPage) {
	if(startPage >0) {
	    Pageable pageable = PageRequest.of(startPage, ApplicationConstants.TOTAL_NUMBER_OF_DOCUMENT,Sort.by(CustomerConstants.ID));
	    Query query = new Query().with(pageable);
	    return mongoTemplate.find(query,CustomerDetails.class);
	}else {
	    return customerRepository.findAll();	    
	}
    }

    public List<CustomerDetails> getAllCustomerInfo(int id) {
	List<CustomerDetails> customerList = new ArrayList<CustomerDetails>();
	try {
	    Criteria criteria = new Criteria();
	    Query query = new Query(criteria.where("id").is(id));
	    for(String customerFields: CustomerConstants.CUSTOMER_DETAILS)
		query.fields().include(customerFields);
	    customerList = mongoTemplate.find(query, CustomerDetails.class);
	} catch (Exception ex) {
	    ex.printStackTrace();
	}
	return customerList;
    }
    
  
    
    public CustomerDetails findById(int id) {
	CustomerDetails customerDetails = new CustomerDetails();
	try {
	    return customerRepository.findByid(id);
	}catch(Exception ex) {
	    ex.printStackTrace();
	}
	return customerDetails;
    }
    
    public List<Rentals> findMoviesById(int id) {
	List<Rentals> movies = new ArrayList<Rentals>();
	try {
	    Criteria criteria = new Criteria();
	    Query query = new Query(criteria.where("id").is(id));
	    query.fields().include(CustomerConstants.RENTALS);
	    CustomerDetails customerDetails = mongoTemplate.findOne(query,CustomerDetails.class);
	    if(customerDetails != null) {
		movies = customerDetails.getRentals();
	    }
	}catch(Exception ex) {
	    ex.printStackTrace();
	}
	return movies;
    }
    
    public List<CustomerDetails> getAllCustomersByFilmId(int id) {
	List<CustomerDetails> customerList = new ArrayList<CustomerDetails>();
	try {
	    Criteria criteria = Criteria.where("Rentals.filmId").is(id);
	    Query query = new Query(criteria);
	    for(String customerFields: CustomerConstants.CUSTOMER_DETAILS)
		query.fields().include(customerFields);
	    customerList = mongoTemplate.find(query, CustomerDetails.class);
	} catch (Exception ex) {
	    ex.printStackTrace();
	}
	return customerList;
    }
}
