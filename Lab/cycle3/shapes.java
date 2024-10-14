import java.util.*;
abstract class shape{
	abstract void numberOfSides();
}

class rectangle extends shape{
	void numberOfSides(){
		System.out.println("The number of sides in a rectangle is 4");
	}
}

class triangle extends shape
{
	void numberOfSides(){
		System.out.println("The number of sides in a triangle is 3");
	}
}

class hexagon extends shape{
	void numberOfSides(){
		System.out.println("The number of sides in a hexagon is 6");
	}
}

class main
{
	public static void main(String args[]){
		rectangle r = new rectangle();
		r.numberOfSides();
		triangle t = new triangle();
		t.numberOfSides();
		hexagon h = new hexagon();
		h.numberOfSides();
		}
}
