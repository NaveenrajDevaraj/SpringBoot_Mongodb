/**
 * 
 */
package com.jsonar.service.RestService.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.jsonar.service.RestService.model.Rentals;

/**
 * @author naveenraj.devaraj
 *
 */
@Repository
public interface RentalRepository extends MongoRepository<Rentals, String> {

}
