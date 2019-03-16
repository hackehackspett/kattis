import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Kattis {

  
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int i = 0;
       int ntc = sc.nextInt();
       List<Integer> tc = new ArrayList<>();
       
      
       while(i < ntc){
            tc.add(i, sc.nextInt());
            i++;
       }
       
      
       
       for(int x = 0; x < tc.size();x++){
           int i2 = 1;
           int tot = 1;
          while(i2 != (tc.get(x) + 1)){
             tot = tot * i2;
             i2++;
         }
             System.out.println(tot % 10);
       }
}}
