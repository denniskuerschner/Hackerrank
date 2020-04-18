package com.Platzhalter;

import java.util.Scanner;

public class Platzhalter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
            final String formattedString = String.format("%-15.15s", s1);
            if (x < 100 && x > 9) {
                System.out.println(formattedString + "0" + x);
            } else if (x < 10) {
                System.out.println(formattedString + "00" + x);
            } else {
                System.out.println(formattedString + x);
            }

            //Complete this line
        }
        System.out.println("================================");

	}

}
