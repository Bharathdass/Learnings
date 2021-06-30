package mrng;

public class constructor {

	public static void main(String[] args) {
		new cons2();
		
	}
	
}
abstract class cons1
{
	public cons1()
	{
		System.out.println("cons1");
		
	}
}

class cons2 extends cons1
{
	public cons2()
	{
	System.out.println("cons2");
	}
}