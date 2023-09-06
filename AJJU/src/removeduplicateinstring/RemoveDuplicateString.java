package removeduplicateinstring;

public class RemoveDuplicateString {

	
	    public static String removeDuplicates(String input) {
	        StringBuilder result = new StringBuilder();
	        for (int i = 0; i < input.length(); i++) {
	            char currentChar = input.charAt(i);
	            if (result.indexOf(String.valueOf(currentChar)) == -1) {
	                result.append(currentChar);
	            }
	        }
	        return result.toString();
	    }

	    public static void main(String[] args) {
	        String input = "Hello, World!";
	        String result = removeDuplicates(input);
	        System.out.println("Input String: " + input);
	        System.out.println("String with Duplicates Removed: " + result);
	    }
	}


