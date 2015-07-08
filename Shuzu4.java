package com.mathone.zyf;

public class Shuzu4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//求每门课程的平均分
		int a[][]=new int[20][5];
		 int d[]=new int[20];
		 for(int j=0;j<5;j++)
			 {   int sum=0;
			 for(int i=0;i<20;i++)
			     {
				 float b=(float) Math.random()*100;
				 a[i][j]=(int) b;
				 sum=sum+a[i][j];
				 } 
			 d[j]=sum/20;
			 System.out.print("d["+j+"]="+d[j]+"\t");
			}
	  }
}
