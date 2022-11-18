package testscript;

import java.util.Scanner;

public class Student {
	
	     String name;
	     String city;
	     String rollNo;
	     String address;
	     public Student(String name,String city,String rollNo,String address) {
	         this.name=name;
	         this.city=city;
	         this.rollNo=rollNo;
	         this.address=address;
	     }
	     public void Accept() {
	            System.out.println("Name of the student: "+name);
	            System.out.println("Roll number of the student: "+city);
	            System.out.println("City of the Student :"+rollNo);
	            System.out.println("Address of the student :"+address);
	        }




	     public static void main(String[] args) {
	         // TODO Auto-generated method stub
	         Scanner sc=new Scanner(System.in);
	         System.out.println("Enter Name :");
	         String name=sc.nextLine();
	            
	         System.out.println("Enter city :");
	         String city=sc.nextLine();
	            
	          System.out.println("Enter rollNo :");
	          String rn=sc.next();
	            
	          System.out.println("Enter Address :");
	          String address=sc.next();
	            
	          Student obj = new Student(name,city,rn,address);
	          obj.Accept();
	      }
	}


