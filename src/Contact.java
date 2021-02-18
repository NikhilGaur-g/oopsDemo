
public class Contact {
	void createContact()
	{
		
	}
	void createContact(String a,int b)
	{
		System.out.println("name is:"+ a);
		System.out.println("contact no:"+ b);
	}
	void createContact(String a,int b,int c)
	{
		System.out.println("name is:"+ a);
		System.out.println("contact no1:"+ b);
		System.out.println("contact no2:"+ c);
	}
	

	public static void main(String[] args) {
		Contact cell=new Contact();
		cell.createContact();
		cell.createContact("nikhil",90897);
		cell.createContact("mayank",98765,890765);

	}

}
