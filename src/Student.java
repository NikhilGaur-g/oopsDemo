import java.util.Scanner;

public class Student {

	public static void main(String[] args)
	{
		String name[]=new String[5];
		int mark[]=new int[5];
		int rollno[]=new int[5];
		String course[]=new String[5];
		
		
		
		Scanner s=new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			System.out.println("enter name:"+" "+ (i+1)+ ":");
			name[i]=s.nextLine();

			System.out.println("enter roll no:"+" "+(i+1)+ ":");
			rollno[i]=s.nextInt();

			
			System.out.println("enter marks:");
			mark[i]=s.nextInt();
			s.nextLine();
			

			System.out.println("enter course:"+" "+ (i+1)+ ":");
			course[i]=s.nextLine();
			
		
		}
		
		
		int l=mark.length;
		for(int i=0;i<l-1;i++)
		{
			int pos=i;
			for(int j=i+1;j<l;j++)
			{
				if(mark[j]>mark[pos])
				{
					pos=j;
				}
			}
			//swap mark
			int t=mark[pos];
			mark[pos]=mark[i];
			mark[i]=t;
			//swap name
			String t1=name[pos];
			name[pos]=name[i];
			name[i]=t1;
			//swap rollno

			int t2=rollno[pos];
			rollno[pos]=rollno[i];
			rollno[i]=t2;
			//swap course

			String t3=course[pos];
			course[pos]=course[i];
			course[i]=t3;
			
			
		}
		//print result
		System.out.println("Rank \t name \t rollno \t mark \t course");
		for(int i=0;i<5;i++)
		{
			System.out.println((i+1)+"\t"+name[i]+"\t"+rollno[i]+"\t"+mark[i]+"\t"+course[i]);
		}
		s.close();

	}

}
