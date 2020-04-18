package com.binaryCounter;

import java.util.Arrays;
import java.util.Scanner;

//Aufgabe: Geben Sie die maximal aufeinanderfolgende Zahl 1 aus (binär von n)

public class BinaryCounter {
	private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        int nlength = String.valueOf(Integer.toBinaryString(n)).length(); 
        										//String.valueOf().length()- Methode
        									   //um Länge des Ints herauszufinden
        									  //Integer.toBinaryString()
        								     //Umwandlung dezimal in binär eines ints
        
        
        int binary[] = new int[nlength];    //Größe des Arrays entspricht Länge der Binärzahl
        
        int i = 0;
        while(n > 0) {
        	binary[i] = n%2;				//binary wird in array eingelesen
            n = n/2;
            i++;
            
        }
        int max = 1;
        int zaehler = 1;
        for(int j = 1; j < nlength; j++) {
        	if(binary[j] == 1 && binary[j-1] == 1) {
        		zaehler += 1;
        		if (zaehler > max) {
        			max = zaehler;
        		}
        	}
        	else {
        		zaehler = 1;
        	}
        }
        
        System.out.println(max);
        
        	/*System.out.println(Arrays.toString(binary));      Ausgabe Array mit Mengenklammern
        	for (int output : binary) {
        		
        		System.out.print(output);					Ausgabe einzelner Elemente des Arrays
        	}*/											// schöne Schreibweise
        	
        
        scanner.close();
    }
}
