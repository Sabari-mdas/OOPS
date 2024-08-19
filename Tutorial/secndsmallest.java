import java.util.*;
class secnd_small
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int temp = 0;
		System.out.println("Enter the limit :");
		int n = s.nextInt();
		int a[] = new int[100];
		System.out.println("Enter the elements : ");
		for(int i=0;i<n;i++)
		{
			a[i] = s.nextInt();
		}
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(a[j]<a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=a[j];
				}
			}	
		}
		System.out.print(" The second smallest number is : "+a[n-2]);
	}
}
