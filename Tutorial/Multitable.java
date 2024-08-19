import java.util.*;
class multiplication
{
	public static void main(String args[])
	{
		Scanner S=new Scanner(System.in);
		System.out.println("Enter the number :");
		int n= S.nextInt();
		System.out.println("Enter the range:");
		int m=S.nextInt();
		System.out.println("The multiplication table:");
		for(int i=0;i<=m;i++)
		{	
			System.out.println(n+"X"+i+"="+n*i);
		}
		S.close();
	}
}
