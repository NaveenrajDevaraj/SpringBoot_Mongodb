/**
 * 
 */
package com.jsonar.service.RestService.model;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import com.jsonar.service.RestService.CustomerConstants;

/**
 * @author naveenraj.devaraj
 *
 */
@Document(value=CustomerConstants.DOCUMENT_ID)
public class CustomerDetails {

    @Field(CustomerConstants.ID)
    int id;
    @Field(CustomerConstants.ADDRESS)
    String address;
    @Field(CustomerConstants.CITY)
    String city;
    @Field(CustomerConstants.COUNTRY)
    String country;
    @Field(CustomerConstants.DISTRICT)
    String district;
    @Field(CustomerConstants.FIRST_NAME)
    String firstname;
    @Field(CustomerConstants.LAST_NAME)
    String lastname;
    @Field(CustomerConstants.PHONE)
    String phonenumber;
    @Field(CustomerConstants.RENTALS)
    List<Rentals> rentals;
    
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
     * @return the address
     */
    public String getAddress() {
        return address;
    }
    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }
    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }
    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }
    /**
     * @return the country
     */
    public String getCountry() {
        return country;
    }
    /**
     * @param country the country to set
     */
    public void setCountry(String country) {
        this.country = country;
    }
    /**
     * @return the district
     */
    public String getDistrict() {
        return district;
    }
    /**
     * @param district the district to set
     */
    public void setDistrict(String district) {
        this.district = district;
    }
    /**
     * @return the firstname
     */
    public String getFirstname() {
        return firstname;
    }
    /**
     * @param firstname the firstname to set
     */
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    /**
     * @return the lastname
     */
    public String getLastname() {
        return lastname;
    }
    /**
     * @param lastname the lastname to set
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    /**
     * @return the phonenumber
     */
    public String getPhonenumber() {
        return phonenumber;
    }
    /**
     * @param phonenumber the phonenumber to set
     */
    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }
    /**
     * @return the rentals
     */
    public List<Rentals> getRentals() {
        return rentals;
    }
    /**
     * @param rentals the rentals to set
     */
    public void setRentals(List<Rentals> rentals) {
        this.rentals = rentals;
    }
    
    
    
}
