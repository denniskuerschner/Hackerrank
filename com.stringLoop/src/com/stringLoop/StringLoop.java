package com.stringLoop;

import java.util.Scanner;

public class StringLoop {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();
        
        for (int i = 0; i < n; i++) {
            String s = scan.nextLine();
            String even = "", odd = "";					//Strings mit "" initialisieren
            
            for (int j = 0; j < s.length(); j++) {	   //xxx.length() Methode = Anzahl chars in string
                if (j % 2 == 0)
                    even += s.substring(j, j + 1);	  //xxx.substring() Methode liefert den Teilstring
                else								 //in Klammern wird Beginn und Ende erfasst
                    odd += s.substring(j, j + 1);	//das Ende ist nicht im Teilstring enthalten
            }									   //im Beispiel wird genau ein char aus string extrahiert
            System.out.println(even + " " + odd);
        }
        
        scan.close();
    }
}
