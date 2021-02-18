
public class StaticDemo {
	static int count;
	//int count;
	StaticDemo()
	{
		count=count+1;
	}
	static public void display()
	{
		System.out.println("no. of objects created:"+count);
	}

	public static void main(String[] args) {
		StaticDemo s1=new StaticDemo();
		StaticDemo s2=new StaticDemo();
		StaticDemo s3=new StaticDemo();
		StaticDemo.display();
		//s3.display();
		display();

	}

}
