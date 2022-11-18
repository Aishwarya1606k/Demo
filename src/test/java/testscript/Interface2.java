package testscript;
interface Details{
	
  public void data(String name,int age,String city);
	  
	    
  
}
class emp implements Details{
	public void data(String name,int age,String city) {
		
		System.out.print("Employee Name:"+name);
		
		if( city.equals("Pune")|| city.equals("Mumbai")) {
			System.out.println(" You are at right place!!!");
		         }
	}
	
}
class staff implements Details{
	public void data(String name,int age,String city) {
	
		if(age<=18) {
			System.out.println("Not applicable");
		}else {
			System.out.println("Applicable");		
			}	
	}
	
}
public class Interface2 {

	public static void main(String[] args) {
		Details i;
		i=new emp();
		i.data("Aisha",19,"Pune");
		i=new staff();
		i.data("Aisha",19,"Pune");
		
		
	
		// TODO Auto-generated method stub

	}

}
