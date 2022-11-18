package testscript;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number");
		try {
			int n= sc.nextInt();
			int firstN=0,secondN=1;
			System.out.println("");
			 for(int i=2;i<n;i++) {
				 int thirdN=firstN+secondN;
				 System.out.println(""+thirdN);
				 firstN=secondN;
				 secondN=thirdN;
			 }
			
		}catch(Exception ex) {
			System.out.print("Invalid");
			
		}
		}
		
		
		
	}


