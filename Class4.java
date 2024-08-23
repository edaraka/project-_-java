package pack.com.example1.myclass;
import java.util.Iterator;
import java.util.LinkedList;
public class Class4 {
	 static LinkedList<Object>l1 = new LinkedList<Object>();
	public static void main(String[] args) {
	l1.add(10);
	l1.add(l1);
	l1.add(12);
	l1.add(13);
	l1.add(14);
	l1.add("karthik");
	System.out.println(l1);
	l1Clone();
	
	for(Object obj :l1)
	{
		System.out.println(obj);
	}
	Iterator<Object> iterator = l1.iterator();
	while(iterator.hasNext())
	{
		System.out.println(iterator.next());
	}
	}
	@SuppressWarnings("unchecked")
	public static  void l1Clone()
	{
		System.out.println(l1);
		LinkedList<Integer> clonedList = (LinkedList<Integer>) l1.clone();
		System.out.println(clonedList);
		System.out.println(l1);
	}
}