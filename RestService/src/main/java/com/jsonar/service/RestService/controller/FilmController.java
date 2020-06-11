/**
 * 
 */
package com.jsonar.service.RestService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jsonar.service.RestService.model.CustomerDetails;
import com.jsonar.service.RestService.model.Film;
import com.jsonar.service.RestService.services.CustomerService;
import com.jsonar.service.RestService.services.FilmService;

/**
 * @author naveenraj.devaraj
 *
 */
@RestController
@RequestMapping("films")
public class FilmController {

    @Autowired
    FilmService filmService;
    
    @Autowired
    CustomerService customerService;
    
    @GetMapping("/id")
    public Film getFilmById(@RequestParam("id") int id){
	return filmService.findById(id);
    }
    
    @GetMapping("/getAllFilmDetails")
    public List<Film> getAllFilmDetails(@RequestParam(value = "startPage", required = false, defaultValue = "0") int startPage){
	return filmService.findAllFilmsSpecifiedDetails(startPage);
    }
    
    @GetMapping("/getAllCustomersByFilmId")
    public List<CustomerDetails> getAllCustomersByFilmId(@RequestParam("id") int filmId){
	return customerService.getAllCustomersByFilmId(filmId);
    }
    
    
}
