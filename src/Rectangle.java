
public class Rectangle {
	int length,breath,area;
	
	Rectangle(int length,int breath)
	{
		this.length=length;
		this.breath=breath;
		
	}
	int returnArea()
	{
		area=this.length*this.breath;
		return area;
	}

	public static void main(String[] args) {
		Rectangle r=new Rectangle(10,20);
		int a=r.returnArea();
		System.out.println("Area of rectangle:"+ a);

	}

}
