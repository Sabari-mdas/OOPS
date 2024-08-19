import java.lang.*;
import java.util.*;
class powerroot
{
	public static void main(String args[])
{
	int a;
	Scanner s = new Scanner(System.in);
	System.out.println("Enter a number ");
	a = s.nextInt();
	double Root = Math.sqrt(a);
	System.out.println("Enter Two NUmbers To Calculated The Power "+Root );
	int x = s1.nextInt();
	int y = s1.nextInt();
	double power = Math.pow(x,y);

	System.out.println("The exponintal value : "+power);
	s.close();
	}
}
