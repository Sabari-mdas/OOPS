import java.util.*;
class sum
{
	public static void main(String args[])
	{
		Scanner S=new Scanner(System.in);
		int sum=0,rem=0;
		System.out.println("Enter the number");
		int n=S.nextInt();
		while(n!=0)
		{ 
		  rem=n%10;
		  sum=sum+rem;
		  n=n/10;
		}
		System.out.println("The sum of digits is"+sum);
		S.close();
	}
}
