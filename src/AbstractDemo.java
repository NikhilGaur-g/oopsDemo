abstract class Animal1{
	abstract void makesound();
	public void eat()
	{
		System.out.println("i can eat");
	}
}
class Dog1 extends Animal1{
	public void makesound()
	{
		System.out.println("bark bark");
	}
}
public class AbstractDemo {

	public static void main(String[] args) {
		Dog1 d=new Dog1();
		d.makesound();
		d.eat();

	}

}
