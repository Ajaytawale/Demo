package reverseString;

public class Reverse {
	public class StringReversal {
	    public static void main(String[] args) {
	        String input = "Hello, World!";
	        String reversed = reverseWithStringForLoop(input);
	        System.out.println("Reversed string: " + reversed);
	    }

	    public static String reverseWithStringForLoop(String input) {
	        int length = input.length();
	        StringBuilder reversed = new StringBuilder();

	        for (int i = length - 1; i >= 0; i--) {
	            reversed.append(input.charAt(i));
	        }

	        return reversed.toString();
	    }
	}


}

webelement dropdown = driver.findElement(by.xpat(""));
select newdropdown = new select(dropdown);
select.byid();
select.byname();
select.byVisibleText();
