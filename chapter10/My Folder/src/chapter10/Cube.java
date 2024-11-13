package chapter10;

public class Cube extends Rectangle
{
private double height;
public Cube(double l,double w,double h)
{
	super(l,w);
	height = h;
}
public void setHeight(double h)
{
	height =h;
}
public double getHeight()
{
	return height;
}
public double getVol()
{
	double v = super.getArea()*height;
	return v;
}
public double getSurfaceArea()
{
	double sa = super.getArea()*6;
	return sa;
}
public void printInfo()
{
	super.printInfo();
	System.out.println("Height ="+height);
	System.out.println("Surface area = "+getSurfaceArea());
	System.out.println("Volume = "+getVol());
}
}
