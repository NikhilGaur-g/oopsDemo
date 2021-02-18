
 interface TollBooth {
	public void calculateToll(Truck t);
	public void display();
	public void reset();
 }
 
  class AlleghenyTollBooth implements TollBooth
 
  {
	  int trucksarrived;
	  int receiptnet;
	  AlleghenyTollBooth()
	  {
		  trucksarrived=0;
		  receiptnet=0;
	 }
	  int amt;
	 public void calculateToll(Truck t)
	 {
		int axel=t.axelf();
		int wt=t.wtford();
		int amt=(5*axel)+(10*(wt/500));
		trucksarrived+=1;
		receiptnet+=amt;
		
		System.out.println("no of axels:"+"\t"+"\t"+ axel);
		System.out.println("Total weight:"+"\t"+"\t"+ wt);
		System.out.println("Net amount generated"+"\t"+amt);
		System.out.println("***********************************"+"\n");
	 } 
		 
		
	
	public void display()
	{
		
		System.out.println("Trucks arrival: "+"\t"+"\t"+trucksarrived);
		System.out.println("Totals since collection-Receipts: "+"\t"+receiptnet);
		System.out.println("***********************************"+"\n");
		
	}
	public void reset()
	{
		//trucksarrived=0;
		//receiptnet=0;
		System.out.println("Trucks reset:"+ trucksarrived);
		System.out.println("Receipts reset:"+ receiptnet);
	}



	
	

}
