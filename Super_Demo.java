package Mypackage;
class Bike
{
	void run()
	{
		System.out.println("bike is running");
	}
	void break_bike()
	{
		System.out.println("bike is stopted");
	}
	
}
class Splender extends Bike
{
	void run()
	{
		System.out.println("splender is running");
	}
	void break_bike()
	{
		System.out.println("splender is stopted");
	}
	void gare()
	{
		System.out.println("splender is applying gare");
	}
	
	
}
class Splender16 extends Splender
{
	void run()
	{
		System.out.println("splender 2016 is running");
	}
	void break_bike()
	{
		super.break_bike();
		System.out.println("splender 2016 is stopted");
	}
	
}

public class Super_Demo {

	public static void main(String[] args) 
	{
		Bike s=new Splender();
		s.run();
		
	}

}
