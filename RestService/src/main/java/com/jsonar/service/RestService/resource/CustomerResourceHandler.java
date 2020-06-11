/**
 * 
 */
package com.jsonar.service.RestService.resource;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import com.jsonar.service.RestService.model.Payments;
import com.jsonar.service.RestService.model.Rentals;

/**
 * @author naveenraj.devaraj
 *
 */
public class CustomerResourceHandler {

    public List<Map<String,String>> customerMovieInfo(List<Rentals> rentals) {
	List< Map<String,String>> rentalList = new ArrayList<Map<String,String>>();
	try {
	    Map<String,String> rentalInfo = null;
	    for(Rentals rental: rentals) {
		rentalInfo = new HashMap<String,String>();
		rentalInfo.put("Movie Name ",rental.getFilmTitle());
		rentalInfo.put("Rented on: ",rental.getRentalDate());
		rentalInfo.put("Number of Rented Days",dateParser(rental.getRentalDate(),rental.getReturnDate())+"");
		float totalAmount = 0;
		for(Payments payment: rental.getPayment()) {
		   totalAmount = totalAmount + payment.getAmount();
		}
		rentalInfo.put("Total Payment Amount",totalAmount+"");
		rentalList.add(rentalInfo);
	    }
	}catch(Exception ex) {
	    ex.printStackTrace();
	}
	return rentalList;
	
    }
    
    public long dateParser(String rentalDate, String returnDate) {
	long numberOfDays = 0;
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSS", Locale.ENGLISH);
	try {
	    numberOfDays =  ChronoUnit.DAYS.between(sdf.parse(rentalDate).toInstant(),sdf.parse(returnDate).toInstant());
	} catch (ParseException e) {
	    e.printStackTrace();
	}
	return numberOfDays;
    }
   
}
