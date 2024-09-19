/*Student :Daniel Alfredo Amaya Gamero
 * Subject :CS 123-01
 * Professor: Nidhi Tilak
 * Project 1
 */
package assignements;
import java.util.Scanner;
import java.util.Random;
public class RockPaperScisors 
{
	public static int choice = 0;
	public static Scanner input = new Scanner(System.in);
	public static Random rand = new Random();
	public static void main(String[]args)
	{
		
		
		do 
		{
		System.out.println("Hello welcome to a game of Rock, Paper Scisors");
		System.out.println();
		choice = getChoice();
		switch (choice)
		{
			case 1:
			{
				caseRock(choice);
				break;
			}
			case 2:
			{
				casePaper(choice);
				break;
			}
			case 3:
			{
				caseScisors(choice);
				break;
			}
			case 0:
				break;
		}
		}while (choice != 0);
		System.out.println("*********************************************");
		System.out.println("Thank you for playing");
	}
	public static void caseRock(int p)
	{
		int IA = randNum();
		while (p==IA)
		{
			System.out.println("Is a tie you both choose Rock");
			System.out.println("Let's break this tie ");
			System.out.println("*********************************************");
			IA = randNum();
			p = getChoice();
		}
		if (IA == 2)
		{
			System.out.println("Too bad you loose:\nYou: Rock\nIA: Paper");
			System.out.println("Would you like to keep playing?");
			System.out.println("Yes -> 1\nNo-> 0 ");
			System.out.println("*********************************************");
		}
		else if (IA==3) 
		{
			System.out.println("Congratulation you WON!!!:\nYou: Rock\nIA: Scisors");
			System.out.println("Would you like to keep playing?");
			System.out.println("Yes -> 1\nNo-> 0 ");
			System.out.println("*********************************************");
		}
		else;
	}
	public static void casePaper(int p)
	{
		int IA = randNum();
		while (p==IA)
		{
			System.out.println("Is a tie you both choose Paper");
			System.out.println("Let's break this tie ");
			System.out.println("*********************************************");
			IA = randNum();
			p = getChoice();
		}
		 if (IA == 3)
		{
			System.out.println("Too bad you loose:\nYou: Paper\nIA: Scisors");
			System.out.println("Would you like to keep playing?");
			System.out.println("Yes -> 1\nNo-> 0 ");
			System.out.println("*********************************************");
	}
		else if (IA==1) 
		{
			System.out.println("Congratulation you WON!!!:\nYou: Paper\nIA: Rock");
			System.out.println("Would you like to keep playing?");
			System.out.println("Yes -> 1\nNo-> 0 ");
			System.out.println("*********************************************");
		}
		else;
	}
	public static void caseScisors(int p) 
	{
		int IA = randNum();
		while (p==IA)
		{
			System.out.println("Is a tie you both choose Scisors");
			System.out.println("Let's break this tie ");
			System.out.println("*********************************************");
			IA = randNum();
			p = getChoice();
		}
		if (IA == 1)
		{
			System.out.println("Too bad you loose:\nYou: Scisors\nIA: Rock");
			System.out.println("Would you like to keep playing?");
			System.out.println("Yes -> 1\nNo-> 0 ");
			System.out.println("*********************************************");
		}
		else if (IA==2) 
		{
			System.out.println("Congratulation you WON!!!:\nYou: Scisors\nIA: Paper");
			System.out.println("Would you like to keep playing?");
			System.out.println("Yes -> 1\nNo-> 0 ");
			System.out.println("*********************************************");
		}
		else;
	}
	public static int getChoice()
	{
		System.out.print("Rock = 1\nPaper = 2\nScisors = 3 \nExit = 0\nChoice => ");
		choice = input.nextInt();
		System.out.println();
		System.out.println("*********************************************");
		choice = validate(choice);
		return choice;
	}
	
	public static int randNum()
	{
		int r = rand.nextInt(3)+1;
		return r;
	}
	public static int validate (int x)
	{
		while (x < 0||x>3)
		{
			System.out.println("*********************************************");
			System.out.print("Please choose a number within the optios given: ");
			x = input.nextInt();
			System.out.println("*********************************************");
			
		}
		return x;
	}
}
