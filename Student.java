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
 	System.out.println("�ҵ�ѧ����"+stunum+",�ҽ�"+name+"����ס��"+address);} 
 public static void main(String[]args){ 
 	Student student=new Student(47,"ɱ��","���˽�"); 
 	student.introduce(); 
 	} 
 } 
