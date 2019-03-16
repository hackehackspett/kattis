package kattis;

public class Kattis{

    public static void main(String []args){
        Kattio sc = new Kattio(System.in, System.out);
        
        String a = sc.getWord();
        String b = sc.getWord();
        
        a = new StringBuffer(a).reverse().toString();
        b = new StringBuffer(b).reverse().toString();
        
        int a2 = Integer.parseInt(a);
        int b2 = Integer.parseInt(b);
        
        if(a2 > b2){
            System.out.println(a2);
        }else{
            System.out.println(b2);
        }
}}