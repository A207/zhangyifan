package com.mathone.zyf;

public class Shuzu {

// ��1��ѭ������ά�����ÿһ��Ԫ�ظ�0~100֮������������ 
//��2�������б�ķ�ʽ�����ЩѧԱ��ÿ�ſγ̵ĳɼ���	

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
		 //�б��ʾѧ���ĳɼ�	  
		  for(int j=0;j<5;j++){
			  System.out.print(a[i][j]+"\t");
			 }
		System.out.println("");			
		 } 
	 
	} 		
}
