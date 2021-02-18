class Animal
{
	String name;
	public void eat()
	{
		System.out.println("I can Eat");
	}
	
}
class Dog extends Animal
   {
	public void display()
	{
		System.out.println("my name is"+ name);
	}
	}
public class AnimalTest {

	public static void main(String[] args) {
		Dog labrador=new Dog();
		labrador.name="Rohu";
		labrador.display();
		labrador.eat();

	}

}
