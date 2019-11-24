package myPackage;
interface polygon   
{
	void calcArea();
	void calcPeri();
	void display();
}

class square implements polygon
{
	float side, area, perimeter;
	square(float s)
	{
		side = s;
	}
	
	public void calcArea()
	{
		area = side*side;
	}
	
	public void calcPeri()
	{
		perimeter = 4*side;
	}
	
	public void display()
	{
		System.out.println("Area: "+area);
		System.out.println("Perimeter: "+perimeter);
	}

}

class rectangle implements polygon
{
	float length, breadth,area, perimeter;
	rectangle(float l, float b)
	{
		length = l;
		breadth = b;
	}
		
	public void calcArea()
	{
		area = length*breadth;
	}
	
	public void calcPeri()
	{
		perimeter = 2*(length+breadth);
	}
	
	public void display()
	{
		System.out.println("Area: "+area);
		System.out.println("Perimeter: "+perimeter);
	}

}

class prac9a
{
	public static void main(String args[])
	{
		polygon s = new square(5);
		polygon r = new rectangle(5,6);
		s.calcArea();
		s.calcPeri();
		s.display();
		r.calcArea();
		r.calcPeri();
		r.display();
	}
}