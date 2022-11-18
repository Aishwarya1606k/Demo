package testscript;

import java.util.Scanner;

public class Strings {
	public static void main(String[] args) {
		try {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("1.Upper case /n2.Lower case /n3.Split based on char /n4.Reverse"
				+ " String /n5.Reverse in implace /n6.Substring from string "
				+ "/n7.Matching substring from string /n8.Exit");
		int n= sc.nextInt();
		System.out.println("Enter your choice");
		
			if(n==1) {
				System.out.println("Enter the String");
				String str= sc.next();
				System.out.println("Upper case:"+str.toUpperCase());
				
			}else if(n==2) {
				System.out.println("Enter the String");
				String str= sc.next();
				System.out.println("Lower case:"+str.toLowerCase());

			}else if(n==3) {
				System.out.println("Enter the String");
				String str= sc.next();
				System.out.println("Splitted String:"+str.split(str));
			}else if(n==4) { String rev="";
				System.out.println("Enter the String");
				String str= sc.next();
				for(int i=0;i<str.length();i++) {
					char a=str.charAt(i);
							rev=a+rev;
				}
				System.out.println("Reversed String:"+str);
			}else if(n==5) {
				String rev=" ";
				System.out.println("Enter the String");
				String str= sc.next();
				String[] arr=str.split(" ");
				for(int j=0;j<str.length();j++) {
					rev=arr[j].charAt(j)+rev;	
				} 
				System.out.print("Reverse implace"+str);
			}else if(n==6){
				System.out.print("Enter the String");	
				String str= sc.next();
				System.out.print(str.substring(2,4));
			}else if(n==7) {
				System.out.println("Enter the String");
				String str= sc.next();
				String str2= sc.next();
				int res=str.indexOf(str2);
				if(res==-1) {
					System.out.print("No");
		    }else {
					System.out.print("Yes");
				}
				
			}if(n==8) {
				System.out.println("Program Ended");
				System.exit(0);
			}
			
			
			
		}catch(Exception ex) {
			System.out.println("Invalid Choice");
		}
		
		
	}
	
	}

	
		
	
