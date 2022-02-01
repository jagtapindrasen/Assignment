package com.singtel.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Trail {

	public static void main(String[] args) throws InterruptedException {
		String content = "#JUSTIN #WCQ | #WCQ2022 | #Qatar2022\r\n" + 
				"\r\n" + 
				"South Korea beat Syria to qualify for 10th straight FIFA WorldCup straight FIFA WorldCup";

		char[] ch = content.toCharArray();
		if (ch.length > 50) {
			float f = ch.length / 50;
			int remainder = ch.length % 50;
			System.out.println("sdad = " + remainder);
			int temp = Math.round(f);
			System.out.println(temp);

			int t = 0;
			for (int z = 0; z < temp; z++) {
				int y = 50 + t;
				System.out.println(z + 1 + " Chunk of data ");
				while (t < y) {
					System.out.print(ch[t]);
					t++;

				}
				System.out.println();

			}
			if (remainder != 0) {
				System.out.println(temp + 1 + " Chunk of data ");

				System.out.println();
				for (int k = t; k < ch.length; k++) {
					System.out.print(ch[k]);
				}

			}

		}

	}

}
