package removeduplicateinstring;

public class FirstAndLastCharOfString {

	
	    public static void main(String[] args) {
	        String str = "iphone";
	        
	        if (str.length() >= 2) {
	            char firstChar = str.charAt(0);
	            char lastChar = str.charAt(str.length() - 1);
	            
	            System.out.println("First Character: " + firstChar);
	            System.out.println("Last Character: " + lastChar);
	        } else {
	            System.out.println("String is too short to determine first and last characters.");
	        }
	    }
	}


