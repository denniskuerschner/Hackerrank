package com.hashMap;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ContainsKey {
	public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String, Integer> myMap = new TreeMap<String, Integer>(); 
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            
            myMap.put(name, phone); 
            
        }
        while(in.hasNext()){
            String s = in.next();
            if (myMap.containsKey(s)) {
            	System.out.println(s + "=" + myMap.get(s));
            }
            else {
            	System.out.println("Not found");
            }
            // Write code here
        }
        in.close();
    }
}
/* How to check if a HashMap is empty | isEmpty()
How to find the size of a HashMap | size()
How to check if a given key exists in a HashMap | containsKey()
How to check if a given value exists in a HashMap | containsValue()
How to get the value associated with a given key in the HashMap | get()
How to modify the value associated with a given key in the HashMap | put()
*/
