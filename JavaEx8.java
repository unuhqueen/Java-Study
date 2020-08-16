package com.javateam.jse;

import java.util.Scanner;

public class JavaEx8 {

	public static void main(String[] args) {
		//±Ý¾× ÀÔ·Â
		Scanner sc = new Scanner(System.in);
		System.out.println("±Ý¾× ÀÔ·Â: ");
		int money = sc.nextInt();
		
		String msg = "";
		
		money = money / 1000;
		switch(money) {
		case 1: msg = "»ï°¢±è¹äÀ» ¸Ô´Ù."; break;
		case 2: msg = "»ï°¢±è¹ä°ú ÄÅ¶ó¸éÀ» ¸Ô´Ù."; break;
		case 3: case 4: case 5:
			msg = "ÇÜ¹ö°Å¿Í ÁÖ½º¸¦ ¸Ô´Ù."; break;
		default: msg = "°¡¹æ¼ÓÀÇ °ß°ú¹Ù¸¦ ¸Ô´Ù.";
		}
		
		System.out.println(msg);
		sc.close();
	}

}

