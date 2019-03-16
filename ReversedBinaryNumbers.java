package kattis;
public class Kattis{

    public static void main(String []args){
        Kattio sc = new Kattio(System.in, System.out);
        
        int n = sc.getInt(); 
        String bin = Integer.toString(n, 2);
        bin = new StringBuffer(bin).reverse().toString();
        n = Integer.parseInt(bin, 2);
        sc.println(n);
        sc.flush();
}}