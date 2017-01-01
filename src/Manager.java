/**
 * @author Savan Patel
 * Date Nov. 10 2016
 * Assignment 3 question 2
 * Manager
 * 
 * this is a subclass that will inherit the Adult class functions
 * the manager class is used for describing managers as it also has its own methods 
 */
public class Manager extends Adult {
	private double salary;

	/**
	 * @param name
	 * @param year
	 * @param salary
	 * this method takes 3 parameters which are the same as the adult class parameters beside the new 
	 * one that is for this class 
	 */
	public Manager(String name, int year, double salary)
	{
		super(name,year); //calling the super class 
		this.salary = salary;
	}
	/* (non-Javadoc)
	 * @see Adult#toString()
	 * this method displays the new output which is the output of the super class plus with the new info from manager class 
	 */
	public String toString()
	{
		String result = super.toString() + "\nYour salary is: " + "$" + salary;
		return result;
	}
}
