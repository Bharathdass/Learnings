package mrng;

public class GoodBrush {
	Paint pt;
	public void doPaint() {
	
		System.out.println(pt);
	}
}
abstract class Paint{
	
}
class RedPaint extends Paint{
	public String toString() {return "Red colour paint....";}
}
class BluePaint extends Paint{
	public String toString() {return "Blue colour paint....";}
}
class GreenPaint extends Paint{
	public String toString() {return "Green colour paint....";}
}
