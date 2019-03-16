package kattis;

import java.util.Arrays;

public class Kattis{

    public static void main(String []args){
        Kattio sc = new Kattio(System.in, System.out);
        
        int t = sc.getInt();
        
        for(int i = 0;i<t;i++){
            int n = sc.getInt();
            int count = 0;
            String[] cities = new String[n];
            
            for(int x = 0;x<n;x++){
                String city = sc.getWord();
                
                if(!Arrays.asList(cities).contains(city)){
                    cities[x] = city;
                    count++;              
            }}

            System.out.println(count);
        }  
}}