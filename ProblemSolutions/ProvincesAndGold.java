package kattis;

public class Kattis{

    public static void main(String []args){
        Kattio sc = new Kattio(System.in, System.out);
        
        int g = sc.getInt();
        int s = sc.getInt();
        int c = sc.getInt();
        
        int bp = (3*g) + (2*s) + c;
        String vc = "";
        String tc = "";
        
        if(bp >= 8){
            vc += "Province";
        }else if(bp >= 5){
            vc += "Duchy";
        }else if(bp >= 2){
            vc += "Estate";
        }
        if(bp >= 6){
            tc += "Gold";
        }else if(bp >= 3){
            tc += "Silver";
        }else if(bp >= 0){
            tc += "Copper";
        }
        
        if(!"".equals(vc)){
            System.out.println(vc+" or "+tc);
        }else{
            System.out.println("Copper");
        }    
}}