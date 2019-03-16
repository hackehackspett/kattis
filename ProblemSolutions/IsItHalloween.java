package kattis;

public class Kattis{

    public static void main(String []args){
        Kattio sc = new Kattio(System.in, System.out);
        
        String month = sc.getWord();
        int date = sc.getInt();
        if(("OCT".equals(month) && date == 31)||("DEC".equals(month) && date == 25)){
            sc.println("yup");
        }else{
            sc.println("nope");
        }
        sc.flush();
}}