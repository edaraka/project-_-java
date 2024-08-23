package pack3.com.karthik.myclass;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class Class6 {
	static ArrayList<Integer>list = new ArrayList<>();
	public static void main(String[] args) {
		
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		contains();
		Listremove();
		ListClone();
		//Iterator<object> iterator = list.iterator();
		//while(iterator.hasNext())
		//{
			//System.out.println(iterator.next());
		//}
	}
		public static void contains()
		{
			if(list.contains(10))
			{
				System.out.println("is avaliable");
			}
			else
			{
				System.out.println("not avaliable");
			}
		}
		public static void Listremove()
		{
			System.out.println(list);
	       list.remove(0);
	       list.remove(2);
		  System.out.println(list);
			
		}
		public static void ListClone()
		{
			System.out.println(list);
			ArrayList<Integer> clonedList = (ArrayList<Integer>) list.clone();
			System.out.println(clonedList);
			System.out.println(list);
		}
	}