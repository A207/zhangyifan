package com.mathone.zyf;

import java.util.Scanner;

public class Exe5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("|1.增加一个学生|"+"\n"+"|2.显示所有学生|"+"\n"+"|3.退出程序|"+"\n"+"|请选择(1-3)"+"\n");
		Scanner scanner=new Scanner(System.in);
	    int number=scanner.nextInt();
	    String minglingString="";
	    switch(number){
	    case 1:minglingString="增加1个学生";break;
	    case 2:minglingString="显示所有学生";break;
	    case 3:minglingString="退出程序";break; 
	    }
	    System.out.println(minglingString);
	}
}