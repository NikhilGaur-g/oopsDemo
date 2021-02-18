class Student200{
	
	private int roll;
	private String name;
	static private String college="BMS";
	
	public static void changecollege()

{
		college="RVCE";
				}
	Student200(int r,String n){
		roll=r;
		name=n;
	}
	public void display()
	{
		System.out.println(roll+""+name+""+college);
	}
	}
public class TestStaticMethod {

	public static void main(String[] args) {
		Student200.changecollege();//call static method without calling object
		
		Student200 s1=new Student200(101,"Raj");
		Student200 s2=new Student200(102,"Mike");
		Student200 s3=new Student200(103,"John");
		
		s1.display();
		s2.display();
		s3.display();

	}

}
