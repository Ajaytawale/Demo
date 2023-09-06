package removeduplicateinstring;

public class ReverseString {

	
	    public static void main(String[] args) {
	        String original = "Hello, World!";
	        
	        String reversed = reverse(original);
	        
	        System.out.println("Original String: " + original);
	        System.out.println("Reversed String: " + reversed);
	    }

	    public static String reverse(String input) {
	        StringBuilder reversed = new StringBuilder();

	        for (int i = input.length() - 1; i >= 0; i--) {
	            reversed.append(input.charAt(i));
	        }

	        return reversed.toString();
	    }
	}

