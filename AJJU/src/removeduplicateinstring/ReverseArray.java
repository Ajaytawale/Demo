package removeduplicateinstring;

public class ReverseArray {

	
	    public static void main(String[] args) {
	        int[] arr = {1, 2, 3, 4, 5};

	        System.out.println("Original Array: ");
	        printArray(arr);

	        reverse(arr);

	        System.out.println("\nReversed Array: ");
	        printArray(arr);
	    }

	    public static void reverse(int[] arr) {
	        int start = 0;
	        int end = arr.length - 1;

	        while (start < end) {
	            // Swap the elements at start and end
	            int temp = arr[start];
	            arr[start] = arr[end];
	            arr[end] = temp;

	            // Move the pointers towards the middle
	            start++;
	            end--;
	        }
	    }

	    public static void printArray(int[] arr) {
	        for (int i = 0; i < arr.length; i++) {
	            System.out.print(arr[i] + " ");
	        }
	    }
	}


