import java.io.*;
class handling
{
public static void main(String ar[])
{
 	try
 	{
 		FileReader reader=new FileReader("input.txt");
 		FileWriter writer=new FileWriter("output.txt");
 		int character;
 		System.out.println("Reading from input file and writing to output file");
 		while((character=reader.read())!=-1)
 		{
 		writer.write(character);
 		System.out.println((char)character);
 		}
 		reader.close();
 		writer.close();
 		System.out.println("\nFile content written successfully to output file.");
 		}
 	catch(FileNotFoundException e)
	{
 	System.out.println("Error:File not found "+e.getMessage());
 	}
 	catch(IOException e)
 	{
 		System.out.println("Error:I/O Exception "+e.getMessage());
 	}
 	catch(Exception e)
 	{
 		System.out.println("Error:"+e.getMessage());
 	}
 	System.out.println();  
 	}	
 	}
