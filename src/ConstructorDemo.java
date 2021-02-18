
public class ConstructorDemo {
	int id;
	ConstructorDemo()
	{
		System.out.println("In constructor");
		id=10;
	}
	void display()
	{
		System.out.println("id:"+ id);
	}

	public static void main(String[] args) {
		ConstructorDemo obj=new ConstructorDemo();
		ConstructorDemo obj1=new ConstructorDemo();
		obj.display();
		obj1.display();

	}

}
