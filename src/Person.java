import java.util.Scanner;
public class Person {

	private String name;
    private int age;
    private String constituency;
    Scanner s;
    
    Person()
    {
    	System.out.println("voter eligibility app");
    	age=0;
    	name="";
    	constituency="Bagalore";
    	s=new Scanner(System.in);
    }
    Person(String n, int a)
    {
    	name=n;
    	age=a;
    }
    
    Person(String n, int a,String c)
    {
    	name=n;
    	age=a;
    	constituency=c;
    	
    }
    public void input()
    {
    	System.out.println("enter name:");
    	name=s.next();
    	System.out.println("enter age:");
    	age=s.nextInt();
    	
    }
    public void print()
    {
    	System.out.println("name is:"+ name);
    	System.out.println("age is:"+ age);
    	System.out.println("constituency is:"+ constituency);
    }
}
