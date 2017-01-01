/**
 * @author Savan Patel
 * Date Nov. 10 2016
 * Assignment 3 question 2
 * Adult
 * 
 * this class is the super class that will contain the basic info required for a manager and worker
 */
public class Adult {
	private String name;
	private int year;
	
	/**
	 * @param name
	 * @param year
	 * this method had two constructors that will fetch values and assign them to the class variables
	 */
	public Adult(String name, int year)
	{
		this.name = name;
		this.year = year;
	}
	
	/**
	 * @param name
	 * this setter is used to set the name of the employees 
	 */
	public void setName(String name)
	{
		this.name = name;
	}
	/**
	 * @param year
	 * this setter will set the birth year of the employees
	 */
	public void setBirthYear(int year)
	{
		this.year = year;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 * this method is used to print the gathered info. it also over rides the toString function. 
	 */
	public String toString()
	{
		String result = "\nName: " + name + "\nYear of Birth: " + year;
		return result;
	}
}
