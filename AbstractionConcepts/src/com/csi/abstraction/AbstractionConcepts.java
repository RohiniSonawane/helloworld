/**
 * 
 */
package com.csi.abstraction;

/**
 * @author Admin
 *
 */
interface Student
{
void set(int RollNo,String Name);
	
	static void print(double marks)
	{
		System.out.println("Student Marks :"+marks);
	}
	
}
interface library extends Student
{
	//void set(int RollNo,String Name);
	int ID=121;
	void get(int BookId,long totalBook);
	default void display(double price)
	{
		System.out.println("Books Price :"+price);
	}
	
}abstract class college
{
	college()
	{
		System.out.println("--------------hello");
	}
	abstract void net(int cid,String Collegename);
	void put()
	{
		System.out.println("I m From put");
	}
}

class university extends college implements Student,library
{
	@Override
	public void get(int BookId, long totalBook) {
		// TODO Auto-generated method stub
		System.out.println("Book ID :"+BookId+"\nTotal no of books :"+totalBook);
		
	}

	@Override
	public void set(int RollNo, String Name) {
		// TODO Auto-generated method stub
		System.out.println("Roll No :"+RollNo+"\nStudent Name :"+Name);
	}

	@Override
	void net(int cid, String Collegename) {
		// TODO Auto-generated method stub
		System.out.println("College  ID :"+cid+"\nCollege Name :"+Collegename);
	}}
public class AbstractionConcepts {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		university l=new university();
		l.get(121, 1234555);
		l.set(23, "Rohini");
	l.display(123455.67);
	Student.print(100);
	l.net(220, "k k wegh");
	
		
	}

}
