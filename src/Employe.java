
public class Employe {
	String name,address;
	int year;
	
	Employe(String n,int b,String c)
	{
		name=n;
		year=b;
		address=c;
		
		System.out.println(name+"\t"+year+"\t"+"\t"+address);
	}

	public static void main(String[] args) {
		System.out.println("Name"+"\t"+"Year of Joining"+"\t"+"Address");
		Employe e=new Employe("Nikhil",2021,"Indore");
		Employe e1=new Employe("Mike",2020,"Hyd");
		Employe e2=new Employe("Tango",2019,"Delhi");

	}

}
