package com.mathone.lwm;

public class BaseDataType {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println("基本类型，byte二进制位数"+Byte.SIZE);
     System.out.println("基本类型，byte最大值"+Byte.MAX_VALUE);
     System.out.println("基本类型，byte最小值"+Byte.MIN_VALUE);
     
     System.out.println("基本类型，float二进制位数"+Float.SIZE);
     System.out.println("基本类型，float最大值"+Float.MAX_EXPONENT);
     System.out.println("基本类型，float最小值"+Float.MIN_VALUE);
     
     byte b=50;
     
     float f=10.0f;
     double d=20.0;
     //char类型数据赋值
     char ch1='A';
     char ch2=65;
     char ch3='中';
     System.out.println(ch1+" "+ch2+" "+ch3);
     
	}

}
