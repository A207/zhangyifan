package com.mathone.zyf;

public class Shuzu3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//求每个学生的总分
		int a[][]=new int[20][5];
		 int c[]=new int[20];
		 for(int i=0;i<20;i++)
			 {   int sum1=0;
			 for(int j=0;j<5;j++)
			     {
				 float b=(float) Math.random()*100;
				 a[i][j]=(int) b;
				 sum1=sum1+a[i][j];
				 } 
			 c[i]=sum1;
			 System.out.print("c["+i+"]="+c[i]+"\t");
			}
	  }

}
