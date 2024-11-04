import java.util.*;
class test{
	protected void finalize(){
	System.out.println("Object is garbage collected");
	}
	
public static void main(String args[]){
	Scanner s=new Scanner(System.in);
	test t1= new test();
	test t2= new test();
	t1=null;
	t2=null;
	s.close();
	System.gc();
	}}
