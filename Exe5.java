package com.mathone.zyf;

import java.util.Scanner;

public class Exe5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("|1.����һ��ѧ��|"+"\n"+"|2.��ʾ����ѧ��|"+"\n"+"|3.�˳�����|"+"\n"+"|��ѡ��(1-3)"+"\n");
		Scanner scanner=new Scanner(System.in);
	    int number=scanner.nextInt();
	    String minglingString="";
	    switch(number){
	    case 1:minglingString="����1��ѧ��";break;
	    case 2:minglingString="��ʾ����ѧ��";break;
	    case 3:minglingString="�˳�����";break; 
	    }
	    System.out.println(minglingString);
	}
}