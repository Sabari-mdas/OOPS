import java.util.*;
class arraysum
{
	public static void main(String args[])
	{
	  int sum=0;
	  int a[]=new int[50];
	  Scanner s=new Scanner (System.in);
	  System.out.println("Enter the limit");
	  int length=s.nextInt();
	  System.out.println("Enter the elements");
	  for(int i=0;i<length;i++)
	  {
	  	a[i]=s.nextInt();
	  }
	   for(int i=0;i<length;i++)
	  {
	  	sum=a[i]+sum;
	  }
	  System.out.println("the sum is"+sum);
	  s.close();
	 }
}	  		  
