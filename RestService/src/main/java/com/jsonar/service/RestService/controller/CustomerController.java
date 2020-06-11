/**
 * 
 */
package com.jsonar.service.RestService.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jsonar.service.RestService.model.CustomerDetails;
import com.jsonar.service.RestService.resource.CustomerResourceHandler;
import com.jsonar.service.RestService.services.CustomerService;

/**
 * @author naveenraj.devaraj
 *
 */
@RestController
@RequestMapping("customers")
public class CustomerController {

    @Autowired
    CustomerService customerService;
    
    @GetMapping("/getAllCusotmer")
    public List<CustomerDetails> getAll(@RequestParam(value = "startPage", required = false, defaultValue = "0") int startPage) {
	return customerService.findAllCustomer(startPage);
    }

    @GetMapping("/getAllCustomerInfo")
    public List<CustomerDetails> getAllCustomerInfo(@RequestParam("id") int id) {
	return customerService.getAllCustomerInfo(id);
    }

    @GetMapping("/id")
    public CustomerDetails getCustomerById(@RequestParam("id") int id) {
	return customerService.findById(id);
    }

    @GetMapping("/customerMoviesById")
    public List<Map<String,String>> getCustomerMoviesById(@RequestParam("id") int id) {
	List< Map<String,String>> rentalList = new ArrayList<Map<String,String>>();
	try {
	    return new CustomerResourceHandler().customerMovieInfo(customerService.findMoviesById(id));
	} catch (Exception e) {
	    e.printStackTrace();
	}
	return rentalList;
    }
}
