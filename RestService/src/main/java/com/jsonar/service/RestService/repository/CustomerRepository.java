/**
 * 
 */
package com.jsonar.service.RestService.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.jsonar.service.RestService.model.CustomerDetails;

/**
 * @author naveenraj.devaraj
 *
 */
@Repository
public interface CustomerRepository extends MongoRepository<CustomerDetails, String> {

    /*
     * @Query(value =
     * "{'firstname':{$regex : ?0, $options: 'i'},'lastname':{$regex : ?1, $options: 'i'}}"
     * ) Customer findByName(String firstname, String lastName);
     */
    CustomerDetails findByid(int id);
    

}
