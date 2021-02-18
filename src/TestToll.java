
public class TestToll {

	public static void main(String[] args) {
		TollBooth toll=new AlleghenyTollBooth();
		TollBooth toll1=new AlleghenyTollBooth();
		Truck ford=new Truck(5,2000);
		Truck nissan=new Truck(6,1000);
		Truck daewoo=new Truck(3,5000);
		
		toll.calculateToll(ford);
		//toll.display();
		toll.calculateToll(nissan);
		toll.display();
		toll.calculateToll(daewoo);
		toll.display();
		toll1.reset();
		

	}

}
