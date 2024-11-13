package chapter10;
import java.util.Scanner;
public class Student extends Person
{
	public Scanner input = new Scanner(System.in);
	private int studentNumber;
	
	public void reset(String newName,int newStudentNumber)
	{
		super.setName(newName);;
		studentNumber = newStudentNumber;
	}
	public int getStudentNumber()
	{
		return studentNumber;
	}
	public void setStudentNumber(int num)
	{
		studentNumber = num;
	}
	public void writeOutput()
	{
		super.writeOutput();
		System.out.println("Student Number = "+studentNumber);
	}
	public boolean equals(Student otherStudent)
	{
		boolean a = super.hasSameName(otherStudent);
		boolean b;
		boolean c;
		if (this.studentNumber == otherStudent.studentNumber)
			b=true;
		else 
			b=false;
		if (a&&b)
			c=true;
		else
			c=false;
		return c;
	}
	public String toString()
	{
		String s = super.toString() + "\nStudent Number = "+studentNumber;
		return s;
	}
}
 class Undergrad extends Student
 {
	 private int level =1;
	 public void reset(String newName, int newStudentNumber, int newLevel)
	 {
		 super.reset(newName,newStudentNumber);
		 level = newLevel;
	 }
	 public int getLevel()
	 {
		 return level;
	 }
	 public void setLevel(int newLevel)
	 {
		 while (newLevel < 1||newLevel>4)
		 {
			 System.out.print("place a valid level 1-4: ");
			 newLevel = input.nextInt();
			 System.out.println();
		 }
		 level = newLevel;
	 }
	 public void writeOutput()
	 {
		 super.writeOutput();
		 System.out.println("Student Level = "+level);
	 }
	 public boolean equals(Undergrad otherUnder)
	 {
		 boolean a;
		 if (super.equals(otherUnder)) 
		 {
		 if (otherUnder.getLevel()==this.getLevel())
			 a = true;
		 else 
			 a = false;
		 }
		 else 
			 a= false;
		 return a;
	 }
	 public String toString()
	 {
		 String s = super.toString()+"\nStudent Level = "+level;
		 return s;
	 }
 }
