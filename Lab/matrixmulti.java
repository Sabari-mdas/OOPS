import java.util.Scanner;
class MultiMatrix 
{
    public static void main(String[] args) 
  {
  Scanner s = new Scanner(System.in);
  System.out.println("Enter the size of the matrices:");
  int n = s1.nextInt();
  int[][] a = new int[n][n];
  int[][] b = new int[n][n];
  int[][] c = new int[n][n];
  System.out.println("Enter the elements of the first matrix:");
  for (int i = 0; i < n; i++)
  {
    for (int j = 0; j < n; j++)
    {
      a[i][j] = s1.nextInt();
    }
  }
  System.out.println("Enter the elements of the second matrix:");
  for (int i = 0; i < n; i++)
  {
    for (int j = 0; j < n; j++)
    {
      b[i][j] = s1.nextInt();
    }
  }
  System.out.println("The product of the matrices is:");
  for (int i = 0; i < n; i++)
  {
    for (int j = 0; j < n; j++)
    {
      c[i][j] = a[i][j] * b[i][j];
    }
  }
  for (int i = 0; i < n; i++) 
  {
    for (int j = 0; j < n; j++)
      {
        System.out.print(c[i][j] + " ");
      }
      System.out.println();
  }
   s1.close();
  }}
