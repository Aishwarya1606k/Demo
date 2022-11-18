package testscript;
interface car{
	public void door();
	
}

class BMW implements car{
	public void door() {
		int a;
		System.out.print("Door of BMW car");
	}
}
class XYZ implements car
{
	public void door(){
		int a=5,b=4,c;
		c=a+b;
		System.out.print("XYZ car door:"+c);
	}
}
 public class InterfaceDemo{

	public static void main(String[] args) {
		
		car o;
		o=new BMW();
		o.door();
		o=new XYZ();
		o.door();
		
	
		
		// TODO Auto-generated method stub

	}

}
