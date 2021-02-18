
class Father
{
	String familyName;
	String houseaddress;
	Father()
	{
		familyName="programmer";
		 houseaddress="delhi";
	}
}
class Son extends Father
{
	Son()
	{
		System.out.println("i'm son");
		System.out.println("my family name is"+ this.familyName+"im from"+this.houseaddress);
	}
	}
class Daughter extends Father{
	Daughter()
	{

		System.out.println("i'm daughter");
		System.out.println("my family name is"+ this.familyName+"im from"+this.houseaddress);
	}
}

public class TestFather {

	public static void main(String[] args) {
		Son s=new Son();
		Daughter d=new Daughter();

	}

}
