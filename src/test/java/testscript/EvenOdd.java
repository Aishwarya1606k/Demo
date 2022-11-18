package testscript;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		try {
			int i= sc.nextInt();
			if(i==0) {
				System.out.print("invalid");
				System.exit(0);	
			}
			else if(i%0==0){
				System.out.print("Even");
			}else {
				System.out.println("Odd");
			}
		}
				catch(Exception ex) {
					System.out.print("Enter integer");
					
				
		}
	
	

}}
