import java.util.Scanner;
public class Kattis {

  
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       int noa = sc.nextInt();
       int tot = 0;
       int i = 0;
       
       while(i < noa){
           int val = sc.nextInt();
           int num = val / 10;
           int pow = val % 10;
           
           tot = (int) (tot + (Math.pow(num, pow)));
           i++;
       }
        System.out.println(tot);
       
    }}