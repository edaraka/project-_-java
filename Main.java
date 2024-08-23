package pack.com.example1.myclass;
import java.util.ArrayList;
public class Main {
	public static void main(String[] args) {
		ArrayList<Student>student = new ArrayList<Student>();
		student.add(new Student(100, "Karthik", 19, 23));
		student.add(new Student(101, "Lokesh", 20, 21));
		student.add(new Student(102, "mahesh", 22, 21));
		student.add(new Student(103, "Surya", 23, 22));
		student.add(new Student(104, "yashwanth", 24, 21));
		for(Student student1 :student)
		{
			System.out.println(student1);
		}
		Student fs = student.get(0);
		System.out.println("\nFrist student in list :"+fs);
		student.remove(1);
		System.out.println("\n removing an element");
		for(Student student1 :student)
		{
			System.out.println(student1);
		}
	}
}