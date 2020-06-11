/**
 * 
 */
package com.jsonar.service.RestService;

import java.util.ArrayList;
import java.util.List;

/**
 * @author naveenraj.devaraj
 *
 */
public class CustomerConstants {
    
    public static final String DOCUMENT_ID = "customer";

    public static final String ID = "_id";
    
    public static final String FIRST_NAME = "First Name";

    public static final String LAST_NAME = "Last Name";

    public static final String CITY = "City";

    public static final String COUNTRY = "Country";

    public static final String DISTRICT = "District";

    public static final String PHONE = "Phone";
    
    public static final String ADDRESS = "Address";

    public static final String RENTALS = "Rentals";

    public static final List<String> CUSTOMER_DETAILS = new ArrayList<String>();

    static {
	CUSTOMER_DETAILS.add(CustomerConstants.FIRST_NAME);
	CUSTOMER_DETAILS.add(CustomerConstants.LAST_NAME);
	CUSTOMER_DETAILS.add(CustomerConstants.ADDRESS);
	CUSTOMER_DETAILS.add(CustomerConstants.CITY);
	CUSTOMER_DETAILS.add(CustomerConstants.DISTRICT);
	CUSTOMER_DETAILS.add(CustomerConstants.COUNTRY);
	CUSTOMER_DETAILS.add(CustomerConstants.PHONE);
    }

}
