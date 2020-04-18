package com.quersumme;

public class Quersumme {
	public static void main(String[] args) {
        System.out.println(quersummeBerechnen(546));
    }

    public static int quersummeBerechnen(int zahl) {
        int quersumme;
        int a = zahl / 100;
        int b = zahl % 100;
        b = b / 10;
        int c = zahl % 10;
        quersumme = a+b+c;
        return quersumme;
        }
}
