package com.javateam.jse;

import java.util.Scanner;

public class JavaEx6 {

	public static void main(String[] args) {
		//±Ý¾× ÀÔ·Â
		Scanner sc = new Scanner(System.in);
		System.out.println("±Ý¾× ÀÔ·Â: ");
		int money = sc.nextInt();
		
		String msg = "";
		
		if(money >= 1000 && money < 2000) {
			msg = "»ï°¢±è¹äÀ» ¸Ô´Ù.";
		} else if(money >= 2000 && money < 3000) {
			msg = "»ï°¢±è¹ä°ú ÄÅ¶ó¸éÀ» ¸Ô´Ù.";
		} else if(money >= 3000) {
			msg = "ÇÜ¹ö°Å¿Í ÁÖ½º¸¦ ¸Ô´Ù.";
		} else {
			msg = "°¡¹æ ¼ÓÀÇ °ß°ú¹Ù¸¦ ¸Ô´Ù.";
		}
		
		System.out.println(msg);
		sc.close();
	}

}
