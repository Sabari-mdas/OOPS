import java.util.*;
class sum
{
	public static void main(String args[])
{
	int a,b;
	Scanner s = new Scanner(System.in);
	System.out.println("Enter 2 Integer  ");
	a = s.nextInt();
	b = s.nextInt();
	int sum = a+b;
	System.out.println("Sum Of 2 integer is : "+sum);
	s.close();
	}
}
