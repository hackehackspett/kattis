package kattis;

public class Kattis{

    public static void main(String []args){
        Kattio sc = new Kattio(System.in, System.out);
        
        String s = sc.getWord();
        int len = s.length();
        int pos = 1;
        char move;
        
        
        for(int i = 0;i<len;i++){
            move = s.charAt(i);
            if(move == 'A'){
                if(pos == 1){
                    pos = 2;
                }else if(pos == 2){
                    pos = 1;
                } 
            }
            if(move == 'B'){
                if(pos == 2){
                    pos = 3;
                }else if(pos == 3){
                    pos = 2;
                } 
            }
            if(move == 'C'){
                if(pos == 1){
                    pos = 3;
                }else if(pos == 3){
                    pos = 1;
                } 
            } 
        }
        System.out.println(pos);
        
}}