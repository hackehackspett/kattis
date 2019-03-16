import java.util.Scanner;
public class Kattis {

  
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       String jon = sc.next();
       String doc = sc.next();
       
       if(jon.length() >= doc.length()){
           System.out.println("go");
       }else{
           System.out.println("no");
       }
       
}}