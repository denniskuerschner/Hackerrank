package com.loop;

import java.util.Scanner;

public class loop {

	private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        int i, j;
        for(i = 1; i < 11; i++){
            j = n * i;
            System.out.println(n + " x " + i + " = " + j);
        }

        scanner.close();
    }
}
