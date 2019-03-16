package kattis;



public class Kattis{

    public static void main(String []args){
        Kattio sc = new Kattio(System.in, System.out);
        
        String s = sc.getWord();
        int size = s.length();
        int count = 0;
        int n = size/3;
        
        String per = "";
        
        for(int i = 0; i<n; i++){
            per += "PER";
        }
        for(int i = 0; i<size;i++){
            if(!(s.charAt(i) == per.charAt(i))){
                count++;
            }
        }
        System.out.println(count);
        
}}