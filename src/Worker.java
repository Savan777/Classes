/**
 @author Savan Patel
 * Date Nov. 10 2016
 * Assignment 3 question 2
 * Worker 
 *
 *This class is a subclass of Adult class which inherits from Adult class
 *This class will get specific info required for worker description 
 */
public class Worker extends Adult{
	private String title;
	
	/**
	 * @param name
	 * @param year
	 * @param title
	 * the worker method had 3 parameters which must at least contain the same parameters as the super class so that
	 * the super class can get its value from the worker class when its called. 
	 */
	public Worker(String name, int year, String title)
	{
		super(name,year);
		this.title = title;
	}
	
	/* (non-Javadoc)
	 * @see Adult#toString()
	 */
	public String toString()
	{
		String result = super.toString() + "\nJob Title: " + title;
		return result;
	}
}
