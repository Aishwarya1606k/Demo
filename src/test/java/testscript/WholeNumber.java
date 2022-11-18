package testscript;

import java.util.Scanner;

public class WholeNumber {
	public static void main() {
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter number");
	    try {
	    	
	    int n= sc.nextInt();
	    if(n>=0) {
	    	System.out.print("Integer");
	    }else {
	    	System.out.println("Whole");
	    }
	    
	    	
	    }catch(Exception ex) {
	    	System.out.println("Invalid");
	    }
	    
		
	}

}
