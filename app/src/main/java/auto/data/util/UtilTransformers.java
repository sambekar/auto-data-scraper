package auto.data.util;

import java.math.BigDecimal;

public class UtilTransformers {
	
	 public static BigDecimal convertToBigDecimal(String amount) {
	        if (amount == null || amount.isEmpty()) {
	            throw new IllegalArgumentException("Invalid input: Amount cannot be null or empty");
	        }
	        
	        // Remove 'Rs.' prefix and commas
	        String cleanedAmount = amount.replace("Rs.", "").replace(",", "").trim();
	        
	        try {
	            return new BigDecimal(cleanedAmount);
	        } catch (NumberFormatException e) {
	            throw new IllegalArgumentException("Invalid input: Unable to parse the amount", e);
	        }
	    
    }

}
