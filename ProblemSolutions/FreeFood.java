import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Kattis {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        List<String> days = new ArrayList<>();
        
        for(int i = 0;i<n;i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            
            for(int i2 = x;i2<=y;i2++){
                if(!days.contains(Integer.toString(i2))){     
                    days.add(Integer.toString(i2));
            }} 
        }
        System.out.println(days.size());
}}