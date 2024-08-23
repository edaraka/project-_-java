package pack.com.example1.myclass;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
//Dequeue is an interface in java.util package that represents a 
//double-ended queue,which allows the add or removed from both ends of the queue
//it was implemented by array dequeue and linked list.
public class Class2 {
	 static Deque<Object> l1 = new ArrayDeque<Object>();
	 static Deque<Integer>i1= new LinkedList<Integer>();
	public static void main(String[] args) {
		i1.addFirst(1);
		i1.addFirst(2);
		i1.addLast(3);
		i1.add(5);
		l1.addFirst("Karthik");
		l1.addLast("lokesh");
		l1.addFirst("suresh");
		l1.addAll(i1);
		LCClone();
		if(l1.isEmpty())
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		l1.clear();
		System.out.println("After clear");
		if(l1.isEmpty())
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		System.out.println("first element :"+l1.peekFirst());
		System.out.println("Second element :"+l1.peekLast());
		System.out.println(i1);
		System.out.println(l1);
		Iterator<Integer> descendingIterator = i1.descendingIterator();
		while(descendingIterator.hasNext())
		{
			System.out.println(descendingIterator.next());
		}
	}
	public static void LCClone()
	{
		System.out.println(l1);
		Deque<Integer>clonedList= new ArrayDeque<>(i1);
		System.out.println(clonedList.hashCode());
		System.out.println(i1.hashCode());
	}
}