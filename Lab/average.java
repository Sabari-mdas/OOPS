import java.util.*;
class average
{
	public static void main(String args[])
{
	int a,b;
	Scanner s = new Scanner(System.in);
	System.out.println("Enter 2 Integers:");
	a = s.nextInt();
	b = s.nextInt();
	float avg = (a+b)/2;
	System.out.println("Average of 2 integers is : "+avg);
	s.close();
}}
