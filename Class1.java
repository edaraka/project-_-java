package pack.com.example1.myclass;

import java.util.LinkedList;
import java.util.Queue;
//queue is an interface is part of the collection for holding 
//elements prior to process a queue is typically FIFO
public class Class1 {
	public static void main(String[] args) {
		Queue<String>l1 = new LinkedList<>();
		l1.add("karthik");
		l1.add("surya");
		l1.add("yashwanth");
		l1.add("Lokesh");
		System.out.println(l1);
	}
}