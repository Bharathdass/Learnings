package mrng;

public class Dog {
	habit ht;
	public void call() {
		
		System.out.println(ht);
	}
}
abstract class habit{
	
}
class stone extends habit {
	public String toString() {return "dog runs.............";}
}
class stick extends habit{
	public String toString() {return "You beat I bite.......";}
}
class biscuit extends habit{
	public String toString() {return "yummy yummy.....wags tail....";}
}



