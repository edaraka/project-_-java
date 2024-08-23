package pack.com.example1.myclass;
	import java.util.ArrayList;
	import java.util.Arrays;
	public class Class9 {
		    public static void main(String[] args) {
		        ArrayList<Integer> dynamicArray = new ArrayList<> (Arrays.asList(1, 2, 3, 4, 5));

		        // Method 1: toArray() method returns an array containing all of the items in the list with type casting
		        Integer[] staticArray1 = dynamicArray.toArray(new Integer[0]);

		        // Method 2: Using toArray() with explicit type
		        Integer[] staticArray2 = new Integer[dynamicArray.size()];
		        staticArray2 = dynamicArray.toArray(staticArray2);
		        // Print the converted arrays
		        System.out.println("Static Array 1: " + Arrays.toString(staticArray1));
		        System.out.println("Static Array 2: " + Arrays.toString(staticArray2));
		    }

}
