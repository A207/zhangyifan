 package com.zyf.day3; 
 
 
 class Student { 
 int stunum; 
 String name; 
 String address; 
 

 Student(int s,String n,String a){ 
         stunum=s; 
         name=n; 
         address=a; 
         } 
 void introduce(){ 
 	System.out.println("我的学号是"+stunum+",我叫"+name+"，我住在"+address);} 
 public static void main(String[]args){ 
 	Student student=new Student(47,"杀手","唐人街"); 
 	student.introduce(); 
 	} 
 } 
