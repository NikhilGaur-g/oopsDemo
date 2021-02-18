
class Bike{
 final int SPEEDLIMIT=90;//final variable
 void run(){
	 //SPEEDLIMIT=400;
	 System.out.println("speed limit of bike is:"+ SPEEDLIMIT);
 }
 public static void main(String args[]){
 Bike obj=new  Bike();
 obj.run();
 }
}