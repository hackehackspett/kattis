package kattis;

import java.util.Arrays;
public class CD{

     public static void main(String []args){
        Kattio sc = new Kattio(System.in, System.out);
        while(true){
            

            int numJack = sc.getInt();
            int numJill = sc.getInt();
            
            if(numJack == 0 && numJill == 0){
                break;
            }

            int[] cdJack = new int[numJack];

            int i = 0;

            while(i < numJack){
                cdJack[i] = sc.getInt();
                i++;
            }

            int sum = 0;


            for(int y = 0;y<numJill;y++){
                    if(Arrays.binarySearch(cdJack, sc.getInt()) >= 0){
                        sum++;
                    }  
            } 

             sc.println(sum);
        
     }
     sc.close();
     }}


       
       
       
       

