package reverseString;

public class ReverseStringClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	        String input = "Hello, World!";
	        String reversed = reverseWithStringForLoop(input);
	        System.out.println("Reversed string: " + reversed);

	

	}

	private static String reverseWithStringForLoop(String input) {
		// TODO Auto-generated method stub
		 int length = input.length();
	        StringBuilder reversed = new StringBuilder();

	        for (int i = length - 1; i >= 0; i--) {
	            reversed.append(input.charAt(i));
	            int length = input.length();
	            StringBuilder reversed = new StringBuilder();

	            for (int i = length - 1; i >= 0; i--) {
	                reversed.append(input.charAt(i));
	}
