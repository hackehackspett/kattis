package kattis;

public class Kattis{

    public static void main(String []args){
        Kattio sc = new Kattio(System.in, System.out);
        
        String s = sc.getWord();
        String ans = "";
        
        int l = s.length();
        for(int i = 0;i<l-1;i++){
            if(s.charAt(i)!=s.charAt(i+1)){
                ans += s.charAt(i);
            }
        }
        ans += s.charAt(s.length()-1);
        System.out.println(ans);
}}