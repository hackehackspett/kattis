package kattis;
public class Kattis{

    public static void main(String []args){
        Kattio sc = new Kattio(System.in, System.out);
        
        while(sc.hasMoreTokens()){
            
            long x = sc.getLong();
            long y = sc.getLong();

            sc.println(Math.abs(x-y));
            sc.flush();
     }
        sc.close();
    }

}
