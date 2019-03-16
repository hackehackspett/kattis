import java.util.Scanner;
public class Kattis {

  
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String s = sc.next();
       int len = s.length();
       int i = 0;
       
       
       while(len != i){
           if(Character.isUpperCase(s.charAt(i))){
               System.out.print(s.charAt(i));
           }
           i++;
       }
    
}}
