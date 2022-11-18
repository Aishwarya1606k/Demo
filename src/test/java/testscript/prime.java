package testscript;

import java.util.Scanner;

public class prime {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number;");
		try {
			int n= sc.nextInt();
			boolean res = true;
			for(int i=2;i<=n/2;i++ ) {
				if(n%i==0) {
					res=false;
					break;
				}
				
			}
			if(res==true) {
				System.out.print("prime");
				
			}else {
				System.out.print("Not prime");
			}
		}catch(Exception ex) {
				System.out.println("Enter integer");
			}
		
		}
		
	}
 

