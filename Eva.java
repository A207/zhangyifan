package com.mathone.lwm;

import java.util.Scanner;

public class Eva {

	private static String monthSring;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scanner=new Scanner(System.in);
    int day=scanner.nextInt();
    String monthString="";
    switch(day)
    {
    case 1:monthString="monday";break;
    case 2:monthString="tuesday";break;
    case 3:monthString="wednesday";break;
    case 4:monthString="thuesday";break;
    case 5:monthString="÷‹ŒÂ";break;
    default :monthString = " ‰»Î¥ÌŒÛ";break;
    }
    System.out.println(monthString);
	}

}
