package com.zyf.day3; 
 
 
class Phone { 
	String name; 
	String brand; 
	int price; 
 	 
     void call(){ 
 	System.out.println("¡ä¨°¦Ì??¡ã?¡ê"); 
     } 
     void sendmassage(){ 
     System.out.println("¡¤¡é?¨¬D??¡ê"); 
     } 
     public static void main(String[]args){ 
     	Phone p=new Phone(); 
     	p.name="Note"; 
     	p.brand="Sumsung"; 
     	p.price=998; 
     	System.out.println(p.name); 
     	System.out.println(p.brand); 
     	System.out.println(p.price); 
     	p.call(); 
     	p.sendmassage(); 
    } 
} 
 	 
