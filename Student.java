package pack.com.example1.myclass;
public class Student {
	private int stuno;
	private String Stuname;
	private int sturollno;
	private int Stuage;
	public Student(int stuno,String Stuname,int sturollno,int Stuage)
	{
		this.stuno=stuno;
		this.Stuname=Stuname;
		this.sturollno= sturollno;
		this.Stuage=Stuage;
	}
	public int getStuno() {
		return stuno;
	}
	public String getStuname() {
		return Stuname;
	}
	public int getSturollno() {
		return sturollno;
	}
	public int getStuage() {
		return Stuage;	
	}
	@Override
	public String toString() {
		return "Student [stuno=" + stuno + ", Stuname=" + Stuname + ", sturollno=" + sturollno + ", Stuage=" + Stuage
				+ "]";
	}
}