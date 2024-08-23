package pack.com.example1.myclass;
import java.util.ArrayList;
import java.util.Arrays;
//convert static to dynamic
public class Class10 {
	public static void main(String[] args) {
		Integer[]staticarray= {1,2,3,4,5};
		 ArrayList<Integer> dynamicarray= new ArrayList<> (Arrays.asList(staticarray));
		 System.out.println(dynamicarray);
		 dynamicarray.add(10);
		 System.out.println(dynamicarray);
		 dynamicarray.remove(0);
		 System.out.println(dynamicarray);
		 System.out.println("dynamic array ="+dynamicarray);
		 
	}

}
