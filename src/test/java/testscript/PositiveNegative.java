package testscript;

import java.util.Scanner;

public class PositiveNegative {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		try {
			int n=sc.nextInt();
			if(n==0){
				System.out.println("Not positive nor negative");
				
				
			}else if(n<0) {
				System.out.println(" negative");
				
			}else {
				System.out.println("Positive");
			}
		
		}catch(Exception ex) {
			System.out.print("Invalid");
		}
	}

}
