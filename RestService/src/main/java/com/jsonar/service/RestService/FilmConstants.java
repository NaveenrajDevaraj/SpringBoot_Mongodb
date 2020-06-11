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
public class FilmConstants {
    
    public static final String DOCUMENT_ID = "film";
    
    public static final String ID = "_id";
    
    public static final String TITLE = "Title";

    public static final String CATEGORY = "Category";

    public static final String DESCRIPTION = "Description";

    public static final String RATING = "Rating";

    public static final String RENTAL_DURATION = "Rental Duration";
    
    public static final String LENGTH = "Length";
    
    public static final String REPLACEMENT_COST = "Replacement Cost";
    
    public static final String SPECIAL_FEATURES = "Special Features";
    
    public static final String ACTORS = "Actors";

   
    public static final List<String> FILM_DETAILS = new ArrayList<String>();

    static {
	FILM_DETAILS.add(FilmConstants.TITLE);
	FILM_DETAILS.add(FilmConstants.CATEGORY);
	FILM_DETAILS.add(FilmConstants.DESCRIPTION);
	FILM_DETAILS.add(FilmConstants.RATING);
	FILM_DETAILS.add(FilmConstants.RENTAL_DURATION);
    }

    
}
