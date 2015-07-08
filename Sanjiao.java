package com.mathone.lwm;

import java.util.Scanner;

public class Sanjiao {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input=new Scanner(System.in);
        System.out.print("«Î ‰»Î––∫≈:");
        int num=input.nextInt();
        
     for(int i=1;i<=num;i++){
        	//¥Ú”°ø’∏Ò
        	for(int j=1;j<=num-i;j++){
        		System.out.print(" ");	
        	}
        	//¥Ú”°–«∫≈
        	for(int j=1;j<=2*i-1;j++){
        	System.out.print("*");
        	}
        	                System.out.println();          
        }
	}

}
