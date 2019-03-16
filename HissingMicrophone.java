import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Kattis{

     public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        Pattern ss = Pattern.compile(".*ss.*");
        Matcher matcher = ss.matcher(word);
        boolean hiss = matcher.matches();
        if(hiss){
            System.out.println("hiss");
        } else{
            System.out.println("no hiss");
        }
        
     }}