/**
 @author Savan Patel
 *Date Nov. 10 2016
 * Assignment 3 question 2
 * myMain
 *
 *This is just a testing class that will test the program 
 */
public class myMain {
	public static void main(String[] args)
	{
		Worker a = new Worker("Mark",1995,"Enineer"); //creating a worker object
		Manager b = new Manager("Paul",1995,50000); //creating a manager object 
		
		System.out.println(a.toString());//printing worker info.
		System.out.println(b.toString()); //printing manager info.
	}
}
