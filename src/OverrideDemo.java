class Bank
{
	int getroi()
	{
		return 0;
	}
	}
class Sbi extends Bank
{
int getroi()
{return 8;
	}
}

class Icici extends Bank
{
int getroi()
{
	return 7;}
}
class Axis extends Bank
{
	int getroi()
	{
		return 9;
	}}
public class OverrideDemo {

	public static void main(String[] args) {
		Sbi s=new Sbi();
		Icici i=new Icici();
		Axis a=new Axis();
		System.out.println("sbi roi:"+ s.getroi());
		System.out.println("icici roi:"+ i.getroi());
		System.out.println("axis roi:"+ a.getroi());

	}

}
