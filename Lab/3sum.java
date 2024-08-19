import java.util.*;
class sum
{
    public static void main(String args[])
    {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter Three Numbers:");
        float a=s.nextInt();
        float b=s.nextInt();
        float c=s.nextInt();
        float sum=a+b+c;
        System.out.println("The sum is "+sum); 
        s.close();
    }
}
