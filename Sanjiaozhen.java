package com.mathone.zyf;

import java.util.Scanner;

public class Sanjiaozhen {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Integer.toHexString(13)
        Scanner input=new Scanner(System.in);
        System.out.print("�������к�:");
        int num=13;
        
          for(int i=0;i<=13;i++){
        	//��ӡ�ո�
        	for(int j=1;j<=num-i;j++){
        		System.out.print(" ");	
        	}
        	//��ӡ�Ǻ�
        	for(int j=1;j<=2*i-1;j++){
        	System.out.print(Integer.toHexString(i));
        	}
        	System.out.println();          
          }
	}

}
