package pack3.com.karthik.myclass;
public class SampleException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String message;
	public SampleException ()
	{
		message = null;
	}
	public SampleException (String message)
	{
		this.message= message;
	}
	@Override
	public String getMessage() {
		return message;
	}
	@Override
	public String toString() {
		return message;
	}
	}