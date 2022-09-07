
public class APIResponseParser {
    
     /**
	 * Parses the input text and returns a Book instance containing
	 * the parsed data. 
	 * @param response text to be parsed
	 * @return Book instance containing parsed data
	 */
 
	public static Book parse(String response) {
        Book book = new Book();
		String endRule = "<";
		
		String startRule1 = "<title>";		
		String title = parse(response, startRule1, endRule); 
		System.out.println(title);
	    book.setTitle(title);
	    
	    
	    String startRule2 = "<name>";		
		String author = parse(response, startRule2, endRule); 
		System.out.println(author);
	    book.setAuthor(author);
	    
	   
	    String startRule3 = "<original_publication_year type=\"integer\">";		
		String pubYear = parse(response, startRule3, endRule); 
		int year = Integer.parseInt(pubYear);
		System.out.println(pubYear);
	    book.setPublicationYear(year);
	    
	   
	    
	    String startRule4 = "<average_rating>";		
		String avg_rating = parse(response, startRule4, endRule); 
		double rating = Double.parseDouble(avg_rating);
		System.out.println(rating);
	    book.setAverageRating(rating);
	    
	    
	    String startRule5 = "<ratings_count type=\"integer\">";		
	 	String ratings_count = parse(response, startRule5, endRule); 
	 	String ratings_count2 = ratings_count.replaceAll("," , "");
	 	int ratings_count3 = Integer.parseInt(ratings_count2);
	 	System.out.println(ratings_count3);
	 	book.setRatingsCount(ratings_count3);
	 	
	
	 	
	 	String startRule6 = "<image_url>";		
	 	String image = parse(response, startRule6, endRule); 
	 	System.out.println(image);
	 	book.setImageUrl(image);
	 
	 	
	 	    
	    
	    


		
		// Your code
		return book;
     }
     
     // write overloaded parse method with the 3 parameters response, startRule, endRule
     
     private static String parse(String response, String startRule, String EndRule) {
    	 String[] extract1 = response.split(startRule);
    	 String[] extract2 = extract1[1].split(EndRule);
    	 
    	 return extract2[0];
    	 
     }
     
   
     public static void main(String[] args) {
    	 
    	 String response = "<work>" + 
	                            "<id type=\"integer\">2361393</id>" +
	                            "<books_count type=\"integer\">813</books_count>" +
	                            "<ratings_count type=\"integer\">1,16,315</ratings_count>" + 
	                            "<text_reviews_count type=\"integer\">3439</text_reviews_count>" +
	                            "<original_publication_year type=\"integer\">1854</original_publication_year>" +
								"<original_publication_month type=\"integer\" nil=\"true\"/>" +
								"<original_publication_day type=\"integer\" nil=\"true\"/>" +
								"<average_rating>3.79</average_rating>" +
								"<best_book type=\"Book\">" +
									"<id type=\"integer\">16902</id>" +
									"<title>Walden</title>" + 
									"<author>" +
										"<id type=\"integer\">10264</id>" + 
										"<name>Henry David Thoreau</name>" + 
									"</author>" +
									"<image_url>" + 
										"http://images.gr-assets.com/books/1465675526m/16902.jpg" +
									"</image_url>" +
									"<small_image_url>" + 
										"http://images.gr-assets.com/books/1465675526s/16902.jpg" +
									"</small_image_url>" +
								"</best_book>" +
							"</work>";
		
		APIResponseParser.parse(response);
	
		
	}
}