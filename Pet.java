package kattis;
public class Kattis{

    public static void main(String []args){
        Kattio sc = new Kattio(System.in, System.out);
        
        int n = 5;
        int score = 0;
        int contestant = 0;
        
        for(int i = 0;i < n; i++){
            int x = sc.getInt() + sc.getInt() + sc.getInt() + sc.getInt();
            if(x>score){
                score = x;
                contestant = i+1;
            }    
        }
        sc.println(contestant + " " + score);
        sc.flush();
}}