package testscript;

import java.util.Scanner;

public class StudentConstructor {
	 String name;
     String city;
     String rollNo;
     int marks[]=new int[3];
     public StudentConstructor(String name,String city,String rollNo,int marks[]) {
         this.name=name;
         this.city=city;
         this.rollNo=rollNo;
         this.marks=marks;
     }
     float calculatePercentage() {
         float per=0,total=0;
         for(int i=0;i<marks.length;i++) {
             total=total+marks[i];
         }
         per=total/marks.length;
         return per;
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
         int marks[]=new int[3];
         for(int i=0;i<3;i++) {
             System.out.println("Enter Subject-"+(i+1)+" marks :");
             marks[i]=sc.nextInt();
         }
         StudentConstructor s2=new  StudentConstructor(name,city,rn,marks);
         
         System.out.println("Name :"+name);
         System.out.println("RollNo :"+rn);
         System.out.println("City :"+city);
         
         float result=s2.calculatePercentage();
         System.out.println("Marks Percentage :"+result);
         if(result>=0 && result<=40) {
             System.out.println("Fail");
         }
         else if(result>=41 && result<=70) {
             System.out.println("Pass");
         }
         else if(result>=71 && result<=89) {
             System.out.println("First Class");
         }
         else if(result>=90 && result<=100) {
             System.out.println("Topper");
         }
     }

}
