
public class Time {
	int hours;
	int sec,min;
	
	Time(int h,int m,int s)
	{
		sec=s;
		min=m;
		hours=h;
		
	}
	
	public void add(Time obj2)
	{
		this.hours+=obj2.hours;
		this.min+=obj2.hours;
		this.hours+=obj2.hours;
	}
	
	public void arrange()
	{
		if(this.sec>=60)
		{
			this.min+=1;
			this.sec=this.sec-60;
		}
		if(this.min>=60)
		{
			this.hours+=1;
			this.min=this.min-60;
		}
		if(this.hours>12)
		{
			
			this.min=this.min-12;
		}
	}
	void display()
	{
		 System.out.print("Addition is: ");
	        System.out.println(this.hours+":"+this.min+":"+this.sec);
	}

	public static void main(String[] args) {
		 Time obj1=new Time(10,45,60);
	        Time obj2=new Time(3,55,5);        

	        obj1.add(obj2);
	        obj1.arrange();
	        obj1.display();
		

	}

}
