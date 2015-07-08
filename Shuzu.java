package com.mathone.zyf;

public class Shuzu {

// （1）循环给二维数组的每一个元素赋0~100之间的随机整数。 
//（2）按照列表的方式输出这些学员的每门课程的成绩。	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 String name[]={"C++","Java","servlet","JSP","EJb"};
	 for(int j=0;j<5;j++)
	 {
	 System.out.print(name[j]+"\t");
	 }
	 System.out.println("");
	 int a[][]=new int[20][5];
	 for(int i=0;i<20;i++)
		 {
		 for(int j=0;j<5;j++)
		     {
			 float b=(float) Math.random()*100;
			 a[i][j]=(int) b;
			 } 
		 //列表表示学生的成绩	  
		  for(int j=0;j<5;j++){
			  System.out.print(a[i][j]+"\t");
			 }
		System.out.println("");			
		 } 
	 
	} 		
}
