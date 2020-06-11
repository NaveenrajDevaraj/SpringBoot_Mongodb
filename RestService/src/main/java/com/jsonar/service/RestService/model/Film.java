/**
 * 
 */
package com.jsonar.service.RestService.model;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import com.jsonar.service.RestService.FilmConstants;

/**
 * @author naveenraj.devaraj
 *
 */
@Document(value=FilmConstants.DOCUMENT_ID)
public class Film {
    @Field(FilmConstants.ID)
    int id;
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }
    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
    /**
     * @return the category
     */
    public String getCategory() {
        return category;
    }
    /**
     * @param category the category to set
     */
    public void setCategory(String category) {
        this.category = category;
    }
    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }
    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }
    /**
     * @return the length
     */
    public int getLength() {
        return length;
    }
    /**
     * @param length the length to set
     */
    public void setLength(int length) {
        this.length = length;
    }
    /**
     * @return the rating
     */
    public String getRating() {
        return rating;
    }
    /**
     * @param rating the rating to set
     */
    public void setRating(String rating) {
        this.rating = rating;
    }
    /**
     * @return the rentalDuration
     */
    public int getRentalDuration() {
        return rentalDuration;
    }
    /**
     * @param rentalDuration the rentalDuration to set
     */
    public void setRentalDuration(int rentalDuration) {
        this.rentalDuration = rentalDuration;
    }
    /**
     * @return the replacementCost
     */
    public float getReplacementCost() {
        return replacementCost;
    }
    /**
     * @param replacementCost the replacementCost to set
     */
    public void setReplacementCost(float replacementCost) {
        this.replacementCost = replacementCost;
    }
    /**
     * @return the specialFeatures
     */
    public String getSpecialFeatures() {
        return specialFeatures;
    }
    /**
     * @param specialFeatures the specialFeatures to set
     */
    public void setSpecialFeatures(String specialFeatures) {
        this.specialFeatures = specialFeatures;
    }
    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }
    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }
    /**
     * @return the actors
     */
    public List<Actors> getActors() {
        return actors;
    }
    /**
     * @param actors the actors to set
     */
    public void setActors(List<Actors> actors) {
        this.actors = actors;
    }
    @Field(FilmConstants.CATEGORY)
    String category;
    @Field(FilmConstants.DESCRIPTION)
    String description;
    @Field(FilmConstants.LENGTH)
    int length;
    @Field(FilmConstants.RATING)
    String rating;
    @Field(FilmConstants.RENTAL_DURATION)
    int rentalDuration;
    
    @Field(FilmConstants.REPLACEMENT_COST)
    float replacementCost;
    @Field(FilmConstants.SPECIAL_FEATURES)
    String specialFeatures;
    @Field(FilmConstants.TITLE)
    String title;
    @Field(FilmConstants.ACTORS)
    List<Actors> actors;
    
    

}
