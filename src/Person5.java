
public class Person5 {
	
	private Job job;//composition has a relation
	public Person5()
	{
		this.job=new Job();
		job.setSalary(1000L);
		job.setId(123);
		job.setRole("engg");
	}
	public void dispSalary()
	{
		System.out.println(job.getSalary()+" "+job.getId()+" "+job.getRole()); 
	}

}
