package kattis;
public class Kattis{

    public static void main(String []args){
        Kattio sc = new Kattio(System.in, System.out);
        sc.println(-sc.getInt() + 2*sc.getInt() );     
        sc.flush();
}}