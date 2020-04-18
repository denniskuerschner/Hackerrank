package com;

import java.util.Scanner;


public class ArrayContent {
	private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }  
        														//inkrement  ---  dekrement
        for (int j = n - 1; j >= 0; j--) {				//j muss hier n-1 und genau 0 sein, da hier
            System.out.print(arr[j] + " ");				//der Index der Arrays abgebildet werden soll
        } 

        scanner.close();
    }
}

