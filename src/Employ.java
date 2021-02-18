import java.util.Scanner;

public class Employ {
	int salary,hours;
	int a,b;
	 Employ()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter sal");
		a=s.nextInt();
		System.out.println("enter hrs");
		b=s.nextInt();
		this.salary=a;
		this.hours=b;
		s.close();
	}
	void addsal()
	{
		if(this.salary<=500)
		{
			this.salary+=10;
			System.out.println("Salary:"+ this.salary);
		}
		else
		{System.out.println("Salary:"+ this.salary);}
	}
	void addwork()
	{
		if(this.hours>=6)
		{
			this.salary+=5;
			System.out.println("salary addition for work:"+ this.salary);
		}
		else
		{
			System.out.println("no salary addition for work:"+ this.salary);
		}
	}

	public static void main(String[] args) {
		Employ e=new Employ();
		
		e.addsal();
		e.addwork();
		

	}
	

}
