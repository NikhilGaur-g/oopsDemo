
public class Specialist extends Doctor {
	protected String speciality;
	Specialist(final String str,final int num,final String addr,final String special)
	{
		super(str,num,addr);
		speciality=special;
		
	}
	void display()
	{
		super.display();
		System.out.println("speciality is:"+ speciality);
	}
	

}
