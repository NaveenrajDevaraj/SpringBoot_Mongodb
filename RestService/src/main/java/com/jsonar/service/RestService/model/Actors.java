/**
 * 
 */
package com.jsonar.service.RestService.model;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import com.jsonar.service.RestService.ActorConstants;

/**
 * @author naveenraj.devaraj
 *
 */
@Document(value=ActorConstants.DOCUMENT_ID)
public class Actors {

    @Field(ActorConstants.FIRST_NAME)
    String firstName;
    
    
    @Field(ActorConstants.LAST_NAME)
    String lastName;
    
    @Field(ActorConstants.ACTOR_ID)
    int actorId;

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the actorId
     */
    public int getActorId() {
        return actorId;
    }

    /**
     * @param actorId the actorId to set
     */
    public void setActorId(int actorId) {
        this.actorId = actorId;
    }
}
