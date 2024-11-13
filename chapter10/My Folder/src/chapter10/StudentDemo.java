package chapter10;
import	java.util.Scanner;
public class StudentDemo {

	public static Scanner input = new Scanner(System.in);
	public static void main(String[] args) 
	{
	
		int ID,Level;
		final int STUDENTS = 3;
		String name;
		Undergrad[] CSUDH = new Undergrad[STUDENTS];
		for (int i = 0;i<STUDENTS;i++)
		{
			CSUDH[i] = new Undergrad();
			name = input.nextLine();
			CSUDH[i].setName(name);
		}
		for(int i = 0;i<STUDENTS;i++)
		{

			
			ID = input.nextInt();
			CSUDH[i].setStudentNumber(ID);
			
			Level = input.nextInt();
			CSUDH[i].setLevel(Level);
			}
		for (int i = 0;i<STUDENTS;i++)
			System.out.println(CSUDH[i]);
	}

}
