package pack3.com.karthik.myclass;
import java.util.ArrayList;
import java.util.Iterator;
public class Class4 {
	public static void main(String[] args) {
		ArrayList<String>list1 = new ArrayList<String>();
	    list1.add("karthik");
		list1.add("Lokesh");
		list1.add("mahesh1");
		list1.add("Mahesh2");
		list1.add("karthik2");
		for(String  str:list1)
		System.out.println(str);
		
		Iterator<String> iterator = list1.iterator();
		while(iterator.hasNext())
		{
			String str= iterator.next();
			System.out.println(str);
		}
		ArrayList<String>list2 = new ArrayList<String>();
	    list2.add("Rohitsharma");
		list2.add("Gill");
		list2.add("Kl rahul");
		list2.add("bumarah");
		list2.add("kuldeep");
		ArrayList<String>list3 = new ArrayList<String>();
	    list3.add("shreyas iyer");
	    list3.add("siraj");
	    list3.addAll(list1);
	    list3.addAll(list2);
	    if((list3.containsAll(list1)))
	    {
	    	System.out.println("true");
	    }
	    else
	    {
	    	System.out.println("false");
	    }
	    System.out.println(list1);
	    System.out.println(list2);
	    System.out.println(list3);
	    list3.removeAll(list1);
	    if((list3.containsAll(list1)))
	    {
	    	System.out.println("true");
	    }
	    else
	    {
	    	System.out.println("false");
	    }
	    System.out.println(list1);
	    System.out.println(list2);
	    System.out.println(list3);
	    list3.retainAll(list1);
	    System.out.println(list1);
	    System.out.println(list2);
	    System.out.println(list3);
	}
}