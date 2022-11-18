package testscript;

import java.util.Scanner;

public class Fibonacci2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			int n=sc.nextInt();
			int firstN=0,secondN=1;
			if(n==0) {
				System.out.print(firstN);
			}else {
			int thirdN=firstN+secondN;
			System.out.println(firstN+secondN);
			firstN=secondN;
			secondN=thirdN;
			while(thirdN<=n) {
				thirdN=firstN+secondN;
				if(thirdN>n) {
					break;
				}
			System.out.print(thirdN);	
				
			}}
			
		   }catch(Exception ex) {
			System.out.print("Invalid");
		}
	}
}
