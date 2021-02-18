
public class Demo1 {
	
	public void getName() {
		System.out.println("java");
	} 
	public void display()
	{
		this.getName();
	}

	public static void main(String[] args) {
		Demo1 d=new Demo1();
		d.display();
	

	}

}
