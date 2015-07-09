package com.zyf.day3; 
 
 
 public class War { 
 public static void main(String[] args) { 
 	 Army a = new Army(3); 
 	 a.addWeapon(new Tank()); 
 	 a.addWeapon(new Flighter()); 
 	 a.addWeapon(new WarShip()); 
 	 a.attacAll(); 
 	 a.moveAll(); 
 	 } 
 } 
 
 
     interface Assaultable { 
      abstract public void attack(); 
 	} 
 	interface Mobile { 
 	 abstract public void move(); 
 	} 
 	abstract class Weapon implements Assaultable, Mobile { 
 	} 
 //̹��ģ�� 
 	class Tank extends Weapon { 
 	 public void attack() { 
 	 System.out.println("Tank attacks"); 
 	 } 
 	 public void move() { 
 	 System.out.println("Tank moves"); 
 	 } 
 	} 
 //�ɻ�ģ�� 
 	class Flighter extends Weapon { 
 	 public void attack() { 
 	 System.out.println("Flighter attacks"); 
 	 } 
 	 public void move() { 
 	 System.out.println("Flighter moves"); 
 	 } 
 

 	} 
 //ս��ģ�� 
 	class WarShip extends Weapon { 
 	 public void attack() { 
 	 System.out.println("WarShip attacks"); 
 	 } 
      public void move() { 
 	 System.out.println("WarShip moves"); 
 	 } 
 
 	} 
 //����ģ�� 
 	class Army { 
 	 private Weapon[] w= null; 
 	 private int size = 1; 
      public Army(int i) { 
 	 w = new Weapon [i]; 
 	 } 
 //װ������ 
 	 public void addWeapon(Weapon weapon) { 
 	 if (size >= w.length) { 
 	 System.out.println("װ������!"); 
 	 return; 
 	 }  
 	 else 
 	 { 
 	 w[size] = weapon; 
 	 size++; 
 	 } 
	 } 
 
 	 public void attacAll() { 
 	 for (Weapon wa : w) { 
 	 if (wa != null) { 
 	 wa.attack(); 
 	 } 
 	 } 
 	 } 
 
 
 	 public void moveAll() { 
 	 for (Weapon wa : w) { 
 	 if (wa != null) { 
 	 wa.move(); 
 	 } 
 	 } 
 	 } 
 } 
