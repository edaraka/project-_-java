package pack.com.example1.myclass;

import java.util.Enumeration;
import java.util.Vector;

public class Class6 {
	public static void main(String[] args) {
		Vector<String> vector = new Vector<String>();
		vector.add("1st");
		vector.add("2nd");
		vector.add("3rd");
		vector.add("4th");
		vector.add("5th");
		System.out.println(vector);
		vector.add(2, "karthik");
		vector.addFirst( "lokesh");
		vector.addLast("surya");
		System.out.println(vector);
		System.out.println("First element of  :"+vector.firstElement());
		System.out.println("second elements of : "+vector.lastElement());
		System.out.println( "using get to display the index : "+vector.get(0));
		System.out.println(vector);
		Enumeration<String> enumeration = vector.elements();
		while(enumeration.hasMoreElements())
		{
			System.out.println(enumeration.nextElement());
		}
	}

}
