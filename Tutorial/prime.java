import java.util.*;
class prime 
{
    public static void main(String args[])
    {
    Scanner S=new Scanner(System.in);
    int count=0;
    System.out.println("Enter the number");
    int n = S.nextInt();
    for(int i=1;i<=n;i++)
    {
      if(n%i==0)
      {
        count++; 
      }
    }
    if(count==2)
    {
      System.out.println(n+" is a prime number");
    }
    else
    {
      System.out.println(n+" is not a prime number");
    }
    count=0;
    S.close();
    }
}
