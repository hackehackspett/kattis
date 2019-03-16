package kattis;

public class Kattis{

    public static void main(String []args){
        Kattio sc = new Kattio(System.in, System.out);
        
        int h = sc.getInt();
        int v = sc.getInt();
        double v2 = Math.toRadians(v);
        
        double x = Math.sin(Math.toRadians(90)) * (h/Math.sin(v2));
        int ans = (int)x;
        if(ans != x){
            ans++;
        }
        
        System.out.println(ans);
        
}}