/**
 * 
 */
package com.jsonar.service.RestService.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.jsonar.service.RestService.model.Film;

/**
 * @author naveenraj.devaraj
 *
 */
@Repository
public interface FilmRepository extends MongoRepository<Film, String> {
    
    Film findByid(int id);

}
