import java.util.Scanner;
public class Kattis {

  
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int e = sc.nextInt();
       int f = sc.nextInt();
       int c = sc.nextInt();
       
       int empty = e + f;
       int sodas = 0;
       int soda2 = 0;
       
       while(empty >= c){
            sodas = sodas + (empty / c);
            soda2 = (empty / c);
            empty = (empty % c);
            empty = empty + (soda2);
       
       }
        System.out.println(sodas);
    }}