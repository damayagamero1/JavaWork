package chapter10;

public class Person 
{
	private String name;
	public void setName(String newName)
	{
		name = newName;
	}
	public String getName()
	{
		return name;
	}
	public void writeOutput()
	{
		System.out.println("Name = "+name);
	}
	public boolean hasSameName (Person x)
	{
		boolean a ;
		if (this.name.equalsIgnoreCase(x.name))
			a = true;
		else 
			a=false;
		return a;
	}
	public String toString()
	{
		String s = "Student Name = "+name;
		return s;
	}
}
