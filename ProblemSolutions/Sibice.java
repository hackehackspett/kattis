import java.util.Scanner;
public class Kattis {

  
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       int nom = sc.nextInt();
       int w = sc.nextInt();
       int h = sc.nextInt();
       
       int i = 0;
       
       while(i < nom){
           int cm = sc.nextInt();
           int hypo = w*w + h*h;
           hypo = (int) Math.sqrt(hypo);
           
           if(cm <= hypo){
               System.out.println("DA");
           }else{
               System.out.println("NE");
           }         
           i++;
       }  
    }}