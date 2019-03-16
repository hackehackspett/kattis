package kattis;
public class Kattis{

    public static void main(String []args){
        Kattio sc = new Kattio(System.in, System.out);
        
        int x = sc.getInt();
        int n = sc.getInt();
        int sum = 0;
        
        
        for(int i = 0;i<n;i++){
            sum += (x-sc.getInt());
        }
        sum += x;
        sc.println(sum);
        sc.flush();
}}