/**
 * 
 */
package com.jsonar.service.RestService.model;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import com.jsonar.service.RestService.RentalConstants;

/**
 * @author naveenraj.devaraj
 *
 */
@Document(value=RentalConstants.DOCUMENT_ID)
public class Rentals {
    
    @Field(RentalConstants.RENTAL_ID)
    int rentalId;
    @Field(RentalConstants.FILM_TITLE)
    String filmTitle;
    @Field(RentalConstants.RENTAL_DATE)
    String rentalDate;
    /**
     * @return the filmTitle
     */
    public String getFilmTitle() {
        return filmTitle;
    }
    /**
     * @param filmTitle the filmTitle to set
     */
    public void setFilmTitle(String filmTitle) {
        this.filmTitle = filmTitle;
    }
    @Field(RentalConstants.RETURN_DATE)
    String returnDate;
    @Field(RentalConstants.FILM_ID)
    int filmId;
    @Field(RentalConstants.STAFF_ID)
    int staffId;
    /**
     * @return the rentalId
     */
    public int getRentalId() {
        return rentalId;
    }
    /**
     * @param rentalId the rentalId to set
     */
    public void setRentalId(int rentalId) {
        this.rentalId = rentalId;
    }
    /**
     * @return the rentalDate
     */
    public String getRentalDate() {
        return rentalDate;
    }
    /**
     * @param rentalDate the rentalDate to set
     */
    public void setRentalDate(String rentalDate) {
        this.rentalDate = rentalDate;
    }
    /**
     * @return the returnDate
     */
    public String getReturnDate() {
        return returnDate;
    }
    /**
     * @param returnDate the returnDate to set
     */
    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }
    /**
     * @return the filmId
     */
    public int getFilmId() {
        return filmId;
    }
    /**
     * @param filmId the filmId to set
     */
    public void setFilmId(int filmId) {
        this.filmId = filmId;
    }
    /**
     * @return the staffId
     */
    public int getStaffId() {
        return staffId;
    }
    /**
     * @param staffId the staffId to set
     */
    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }
    /**
     * @return the payment
     */
    public List<Payments> getPayment() {
        return payment;
    }
    /**
     * @param payment the payment to set
     */
    public void setPayment(List<Payments> payment) {
        this.payment = payment;
    }
    
    @Field(RentalConstants.PAYMENTS)
    List<Payments> payment;

}
