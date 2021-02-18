
public class PersonTest {

	public static void main(String[] args) {
		Person objPerson=new Person();
		Person objPerson1=new Person("raj",30);
		Person objPerson2=new Person("mike",30,"delhi");
		
		objPerson.input();
		objPerson.print();
		objPerson1.print();
		objPerson2.print();
		

	}

}
