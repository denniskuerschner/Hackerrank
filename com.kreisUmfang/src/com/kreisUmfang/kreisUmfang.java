package com.kreisUmfang;

public class kreisUmfang {

	public static void main(String[] args) {
        kreisumfangAusdrucken(5);
    }

    public static double kreisumfangAusdrucken(int radius) {
        //schreib hier deinen Code
        double pi = 3.14;
        double umfang;
        umfang = 2 * pi * radius;
        System.out.println(umfang);
        return 0;
    }

}
