package com.totalCost;

import java.util.Scanner;

public class totalCost {

	public static double solve(double meal_cost, int tip_percent, int tax_percent) {
		double tip, tax;
        tip = (double) tip_percent;
        tax = (double) tax_percent;
         double total_cost = meal_cost + (meal_cost * (tip / 100)) + (meal_cost * (tax / 100));
        
        return total_cost;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double meal_cost = scanner.nextDouble();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tip_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tax_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        System.out.println(Math.round(solve(meal_cost, tip_percent, tax_percent)));
        

        scanner.close();
    }

}
