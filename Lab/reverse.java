import java.util.*;
class reverse 
{
  public static void main(String[] args) {
  String str, reverse = "";
  Scanner s = new Scanner(System.in);
  System.out.println("Enter the string:");
  str = s.nextLine();
  int length = str.length();
  for (int i = length - 1; i >= 0; i--) 
  {
      reverse = reverse + st.charAt(i);
  }
	System.out.println("the reversed string is"+reverse);
  s.close();
  }
}
