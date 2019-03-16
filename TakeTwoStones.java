package kattis;
public class Kattis{

    public static void main(String []args){
        Kattio sc = new Kattio(System.in, System.out);
        
        
        int n = sc.getInt();
        
        if((n % 2) == 0){
            sc.println("Bob");
        }else{
            sc.println("Alice");
        }
        sc.flush();
}}
