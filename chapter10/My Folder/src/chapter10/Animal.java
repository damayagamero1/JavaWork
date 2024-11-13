package chapter10;

 class Animaldemo 
{
	 public void makeSound()
{
	System.out.println("this also make sound");
}
}
 class dog
 {
	 public void makeSound(String a)
	 {
		 System.out.println("Dog Barks");
		 System.out.println(a);
	 }
 }
 class Cat
 {
	 public void makeSound(String a)
	 {
		 System.out.println("Cat meows");
		 System.out.println(a);
	 }
 }
public class Animal
{
	public static void main(String[]args)
	{
		Animal_one myA_one= new Animal_one();
		myA_one.makeSound();
		System.out.println();
		Animaldemo myA = new Animaldemo();
		myA.makeSound();
		System.out.println();
		dog mydog = new dog();
		mydog.makeSound("Bark");
		System.out.println();
		Cat myCat = new Cat();
		myCat.makeSound("mew");
	}
	
	
}

