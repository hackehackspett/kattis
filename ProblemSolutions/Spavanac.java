package kattis;
public class Kattis{

    public static void main(String []args){
        Kattio sc = new Kattio(System.in, System.out);
        
        int h = sc.getInt();
        int m = sc.getInt();
        int x = 0;
        
        if(m < 45 && h > 0){
            h = h-1;
            x = 45-m;
            m = 60-x;
        }else if(m < 45 && h == 0){
            x = 45-m;
            m = 60-x;
            h = 23;          
        }else{
            m = m-45;
        }   
        sc.println(h + " " + m);
        sc.flush();
}}