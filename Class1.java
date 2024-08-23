package pack3.com.karthik.myclass;
public class Class1 {
	public static void main(String[] args) {
		try
		{
			System.out.println("try start");
			int a= 10;
			int n = args.length;
			System.out.println(n);
			int b = a/n;
			if(n ==0)
			{
				throw new SampleException("Sample Exception");
			}
			System.out.println(b);
			System.out.println ("First parameter " + args[0]);

			System.out.println ("second parameter " + args[1]);

			System.out.println ("Third parameter " + args[2]);
		}
		catch (ArithmeticException e)
		{
			System.out.println("divided by zero");
		}
		catch (SampleException e)
		{
			System.out.println(e.getMessage());
		}
	}
}