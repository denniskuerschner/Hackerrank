package mathPow;

import java.util.Scanner;

public class mathPow {

    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt(); 
            int getter = 0;
            
            
            for(int j = 0; j < n; j++){
            	int snowball;
            	if(j > 0) {
            		snowball = getter;
            	} else {
            		snowball = a;
            	}
                snowball += Math.pow(2, j) * b;                
                System.out.print(snowball + " ");
                getter = snowball;
            }
            System.out.println();
        }
        in.close();

    }
}



