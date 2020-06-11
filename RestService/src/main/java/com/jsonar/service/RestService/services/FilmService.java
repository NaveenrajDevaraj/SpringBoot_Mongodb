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
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import com.jsonar.service.RestService.ApplicationConstants;
import com.jsonar.service.RestService.FilmConstants;
import com.jsonar.service.RestService.model.Film;
import com.jsonar.service.RestService.repository.FilmRepository;

/**
 * @author naveenraj.devaraj
 *
 */
@Service
public class FilmService {

    @Autowired
    FilmRepository filmRepository;
    
    @Autowired
    MongoTemplate mongoTemplate;
    
    public Film findById(int id){
	Film film = new Film();
	try {
	    film = filmRepository.findByid(id);
	}catch(Exception ex) {
	    ex.printStackTrace();
	}
	return film;
    }
    
    public List<Film> findAllFilmsSpecifiedDetails(int startPage) {
	List<Film> filmsList = new ArrayList<Film>();
	try {  
	    Query query = new Query();
	    if(startPage >0) {
		Pageable pageable = PageRequest.of(startPage, ApplicationConstants.TOTAL_NUMBER_OF_DOCUMENT,Sort.by(FilmConstants.ID));
		query.with(pageable);
	    }
	    for(String filmFields: FilmConstants.FILM_DETAILS)
		query.fields().include(filmFields);
	    filmsList = mongoTemplate.find(query, Film.class);
	} catch (Exception ex) {
	    ex.printStackTrace();
	}
	return filmsList;
    }
}
