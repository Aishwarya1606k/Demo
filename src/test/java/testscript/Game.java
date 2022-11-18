package testscript;

import java.util.Scanner;

public class Game {
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int total=21;
		while(total>=1) {
			if(total !=1) {
				System.out.println("Enter between 1 to 4");	
			}else {
				System.out.println("Enter 1");
			}
			    System.out.println("Your turn");
			    int n=sc.nextInt();
			    if(total==1) {
				break;
			}
			if(n>=1 && n<=4 && n<=total) {
				int x=5-n;
				System.out.println("System turn"+x);
				total=total-5;
				System.out.println("Sticks remaining"+total);
			}else {
				System.out.println("Enter valid number!!!");
			}
		
		
		System.out.println("You lose!!");
	
	   }	
	}
}

