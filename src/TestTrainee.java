import java.util.Scanner;
class Trainee//class declaration
{
	int tId;
	String tName;
	String technology;
	float salary,stipend;
	
	//DDEFINE METHOD
	void input()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter id,name,technology,salary of employee:");
		tId=s.nextInt();
		tName=s.next();
		technology=s.next();
		salary=s.nextFloat();
		s.close();
	}
	float calculate()
	{
		stipend=salary-200;
		return stipend;
	}
	void display()
	{
		System.out.println("********Trainee Details*******");
		System.out.println("Trainee id:"+ tId);
		System.out.println("Trainee name:"+ tName);
		System.out.println("Technology:"+ technology);
		//System.out.println("Stipend:"+ salary);
	}
	
}
public class TestTrainee {

	public static void main(String[] args) {
		Trainee t1=new Trainee(); //obj declaration of trainee class
		Trainee t2=new Trainee();
		t1.input();//method call
		t1.display();
		//t2.input();
		float s1=t1.calculate();
		float s2=t2.calculate();
		t1.display();
		System.out.println("stipend:"+ s1);
		t2.display();
		System.out.println("stipend:"+ s2);

	}

}
