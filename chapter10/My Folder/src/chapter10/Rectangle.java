package chapter10;

public class Rectangle 
{
	private double len;
	private double wid;
	
	public Rectangle(double l,double w)
	{
		len = l;
		wid = w;
	}
	public void setLen(double l)
	{
		len =l;
	}
	public void setWid(double w)
	{
		wid =w;
	}
	public double getLen()
	{
		return len;
	}
	public double getWid()
	{
		return wid;
	}
	public double getArea()
	{
		return (wid*len);
	}
	public void printInfo()
	{
		System.out.println("Lenght = "+len);
		System.out.println("Width = "+wid);
		System.out.println("Area = "+(len*wid));
	}
}
