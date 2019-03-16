package kattis;

public class Kattis{

    public static void main(String []args){
        Kattio sc = new Kattio(System.in, System.out);
        
        int n = sc.getInt();
        double qaly = 0;
        
        for(int i = 0; i<n;i++){
            qaly += sc.getDouble() * sc.getDouble();          
        }
        System.out.println(qaly);     
}}