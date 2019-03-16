package kattis;
public class Kattis{

    public static void main(String []args){
        Kattio sc = new Kattio(System.in, System.out);
        
        int n = sc.getInt();
        int i = 0;
        
        while(i<n){
            int x = sc.getInt();
            if(x % 2 == 0){
                sc.println(x+" is even");
            }else{
                sc.println(x+" is odd");
            }
            sc.flush();
            i++;
        }     
}}