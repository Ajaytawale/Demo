package removeduplicateinstring;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class RemoveDuplicateInArray {


	
	    public static String[] removeDuplicates(String[] inputArray) {
	        List<String> inputList = Arrays.asList(inputArray);
	        HashSet<String> uniqueSet = new HashSet<>(inputList);
	        
	        // Convert the unique elements back to an array
	        String[] uniqueArray = new String[uniqueSet.size()];
	        return uniqueSet.toArray(uniqueArray);
	    }

	    public static void main(String[] args) {
	        String[] inputArray = {"apple", "banana", "cherry", "apple", "date", "banana"};
	        String[] resultArray = removeDuplicates(inputArray);

	        System.out.println("Input Array: " + Arrays.toString(inputArray));
	        System.out.println("Array with Duplicates Removed: " + Arrays.toString(resultArray));
	    }
	}


