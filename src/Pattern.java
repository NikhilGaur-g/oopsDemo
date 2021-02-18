import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		int row,i,j,space=1;
		System.out.println("enter rows");
		Scanner s=new Scanner(System.in);
		row=s.nextInt();
		space=row-1;
		for(i=1;i<=row;i++)
		{
			for(j=1;j<=space;j++)
			{
				System.out.print(" ");
				
			}
			space--;
			for(j=1;j<=2*i-1;j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		space=1;
		
		for(i=1;i<=row;i++)
		{
			for(j=1;j<=space;j++)
			{
				System.out.print(" ");
				
			}
			space++;
			for(j=1;j<=2*(row-i)-1;j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}
