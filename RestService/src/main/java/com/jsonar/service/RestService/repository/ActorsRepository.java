/**
 * 
 */
package com.jsonar.service.RestService.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.jsonar.service.RestService.model.Actors;

/**
 * @author naveenraj.devaraj
 *
 */
@Repository
public interface ActorsRepository extends MongoRepository<Actors, String> {

}
