package com.Solution;

import java.util.Scanner;

class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	// Constructor
	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	
	// Print person data
	public void printPerson(){
		 System.out.println(
				"Name: " + lastName + ", " + firstName 
			+ 	"\nID: " + idNumber); 
	}
	 
}

class Student extends Person{
	private int[] testScores;
    int average = 0, sum;
    char average1;
    Student(String firstName, String lastName, int identification, int[] testScores){
        super(firstName, lastName, identification);
        this.testScores = testScores;
    }
    char calculate(){
    	for(int j = 0; j < testScores.length; j++){
			sum += testScores[j];
		}
    	average = sum / testScores.length;
    	
    	if(average >= 90 && average <= 100) {
    		average1 = 'O';
    	} else if(average >= 80 && average < 90) {
    		average1 = 'E';
    	} else if(average >= 70 && average < 80) {
    		average1 = 'A';
    	} else if(average >= 55 && average < 70) {
    		average1 = 'P';
    	} else if(average >= 40 && average < 55) {
    		average1 = 'D';
    	} else {
    		average1 = 'T';
    	}
    	
    	return average1;
    }
    
    @Override
    public void printPerson(){
         System.out.print(
                "Name: " + lastName + ", " + firstName 
            +     "\nID: " + idNumber); 
    }
}

class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for(int i = 0; i < numScores; i++){
			testScores[i] = scan.nextInt();
		}
		scan.close();
		
		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("\nGrade: " + s.calculate());
	}
}
