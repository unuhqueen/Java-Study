package com.javateam.jse;

import java.util.Scanner;

public class JavaEx7 {

	public static void main(String[] args) {
		//±Ý¾× ÀÔ·Â
				Scanner sc = new Scanner(System.in);
				System.out.println("±Ý¾× ÀÔ·Â: ");
				int money = sc.nextInt();
				
				String msg = "";
				
				msg = (money >= 1000 && money < 2000) ? "»ï°¢±è¹äÀ» ¸Ô´Ù.":
					  (money >= 2000 & money < 3000) ? "»ï°¢±è¹ä°ú ÄÅ¶ó¸éÀ» ¸Ô´Ù.":
					  (money >= 3000) ? "ÇÜ¹ö°Å¿Í ÁÖ½º¸¦ ¸Ô´Ù.":
					  "°¡¹æ¼ÓÀÇ °ß°ú¹Ù¸¦ ¸Ô´Ù.";
				
				System.out.println(msg);
				sc.close();
	}

}
