package kattis;
public class Kattis{

    public static void main(String []args){
        Kattio sc = new Kattio(System.in, System.out);
        
        while(true){
            int n = sc.getInt();
            if(n==-1){
                break;
            }
            
            int[] mph = new int[n];
            int[] hours = new int[n];
            int miles = 0;
            
            for(int i = 0; i < n; i++){
                mph[i] = sc.getInt();
                hours[i] = sc.getInt();
            }
            for(int i = 1; i < n; i++){
                miles += mph[i] * (hours[i]-hours[i-1]);              
            }
            miles += mph[0] * hours[0];
        
            sc.println(miles+" miles");
            sc.flush();
}}}