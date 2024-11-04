import java.util.*;
class excep{
public static void main(String args[]){
	Scanner s= new Scanner(System.in);
	System.out.println("[1] Try&Catch Block \n[2] Throw Error \n[3] Finally");
	int opt = s.nextInt();
	if(opt==1){
		int[] num={1,2,3};
		try{
			System.out.println(num[10]);
			}
		catch(Exception e){
			System.out.println("Try&Catch executed successfully");
			}}
	else if(opt==2){
		throw new ArithmeticException("Custom error message thrown using throw keyword");
			}
	else{
		try{
		int a=2/0;
		}
		finally{
			System.out.println("Finally block executed");
			}
			}}}
