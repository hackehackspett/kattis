package kattis;

public class Kattis{

    public static void main(String []args){
        Kattio sc = new Kattio(System.in, System.out);
        
        double c = sc.getDouble();
        int n = sc.getInt();
        double fc = 0;
        
        for(int i = 0; i<n;i++){
            fc += sc.getDouble() * sc.getDouble();           
        }
        fc = fc*c;
        System.out.println(fc);
        
}}