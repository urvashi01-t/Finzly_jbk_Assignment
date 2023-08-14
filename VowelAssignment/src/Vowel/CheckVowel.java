package Vowel;

public class CheckVowel {

	 public static boolean checkAllVowelsPresent(String str) {
	        str = str.toLowerCase(); 
	        int count = 0; // Count the number of vowels found
	        
	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);
	            
	            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
	                count++;
	            }
	            
	            // Break the loop early if all five vowels are found
	            if (count == 5) {
	                break;
	            }
	        }
	        //returns true when count is 5
	        return count== 5;
	    }
	

}
