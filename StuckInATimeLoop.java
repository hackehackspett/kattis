import java.util.Scanner;
public class Kattis{

     public static void main(String []args){
         
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int n = 1;
        for(int i = count;i > 0;i--){
            System.out.println(n + " Abracadabra");
            n++;
        }
        
     }   
}