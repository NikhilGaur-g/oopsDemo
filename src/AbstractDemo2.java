abstract class Shape{
	String objectname=" ";
	Shape(String name)
	{
		this.objectname=name;
	}
	public void moveto(int x,int y)
	{
		System.out.println(this.objectname+""+"has been moved to"+"x="+x+"and y="+y);
	}
	abstract public double area();
	abstract public void draw();
	
}
class Rect extends Shape{
	int length,width;
	Rect(int length,int width,String name)
	{
		super(name);
		this.length=length;
		this.width=width;
	}
	public void draw()
	{
		System.out.println("rect is drawn");
	}
	public double area()
	{
		return (double)(length*width);
	}
}

class Circle extends Shape{
	double pi=3.14;
	int radius;
	
	Circle(int radius,String name)
	{
		super(name);
		this.radius=radius;
	}
	public void draw()
	{
		System.out.println("circle is drawn");
	}
	public double area()
	{
		return (double)((pi*radius*radius)/2);
	}
}
public class AbstractDemo2 {

	public static void main(String[] args) {
		Rect r=new Rect(2,3,"Rectangle");
		r.draw();
		System.out.println("Area of Rectangle is"+r.area());
		r.moveto(1,2);
		
		Circle c=new Circle(2,"Circle");
		c.draw();
		System.out.println("Area of circle:"+c.area());
		c.moveto(2, 4);
		

	}

}
