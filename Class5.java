package pack.com.example1.myclass;
import java.util.Iterator;
import java.util.Vector;
public class Class5 {
	 static Vector<Object> i1 = new Vector<Object>();
	public static void main(String[] args) {
		i1.add(10);
		i1.add(20);
		i1.add(30);
		i1.add(40);
		System.out.println(i1);
		i1Clone();
		if(i1.isEmpty())
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		i1.clear();
		System.out.println("after clear");
		if(i1.isEmpty())
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		System.out.println(i1);
		for(Object obj1 : i1)
		{
			System.out.println(obj1);
		}
		Iterator<Object> iterator = i1.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
	}
	public static void i1Clone()
	{
		System.out.println(i1);
		@SuppressWarnings("unchecked")
		Vector<Object> clonedList = (Vector<Object>) i1.clone();
		System.out.println(clonedList);
		System.out.println(i1);
	}
}