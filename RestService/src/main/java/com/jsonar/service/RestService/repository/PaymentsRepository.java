/**
 * 
 */
package com.jsonar.service.RestService.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.jsonar.service.RestService.model.Payments;

/**
 * @author naveenraj.devaraj
 *
 */
@Repository
public interface PaymentsRepository extends MongoRepository<Payments, String> {

}
