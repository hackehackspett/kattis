import java.util.Scanner;

public class Kattis{

    public static void main(String []args){
        //Kattio sc = new Kattio(System.in, System.out);
        Scanner sc = new Scanner(System.in);
        
        
        int n = sc.nextInt(); 
        
        for(int i = 0;i<n;i++){
            while(sc.hasNext()){
                String cmd = sc.nextLine();
                if(cmd.startsWith("Simon says")){
                    System.out.println(cmd.substring(11));
                }
        }}     
}}