package pack.com.example1.myclass;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;
public class Class3 {
	static LinkedList<Object>List = new LinkedList<Object>();
	 static Vector<Object>vct1 = new Vector<Object>();
	public static void main(String[] args) {
		
		vct1.add("first");
		vct1.add("second");
		vct1.add("third");
		vct1.add(20);
		List.add("karthik");
		List.add(22);
		List.add("Lokesh");
		List.add(23);
		List.add("mahesh");
		vct1Clone();
		System.out.println(List.addAll(vct1));
		System.out.println(vct1.addAll(List));
    
		
		
		
		
		 Enumeration<Object> enumeration = vct1.elements();
		while(enumeration.hasMoreElements())
		{
			System.out.println(enumeration.nextElement());
		}
		if(vct1.isEmpty())
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("False");
		}
		vct1.clear();
		System.out.println("After clear");
		if(vct1.isEmpty())
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("False");
		}
		Iterator<Object> iterator = vct1.iterator();
		while(iterator.hasNext())
		{
			//System.out.println(iterator.next());
			Object next = iterator.next();
			System.out.println(next);
		}
		 System.out.println(List);
	        System.out.println(vct1);
	}
	
	public static void vct1Clone()
	{
		@SuppressWarnings("unchecked")
		Vector<Object> clonedList = (Vector<Object>) vct1.clone();
		System.out.println(clonedList);
		clonedList.add("karthik2");
		System.out.println(clonedList.hashCode()+" "+vct1.hashCode());
}
}