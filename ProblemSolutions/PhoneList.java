package kattis;

import java.util.Arrays;

public class PhoneList{

    public static void main(String []args){
        Kattio sc = new Kattio(System.in, System.out);
        
        int testcases = sc.getInt();
        int loopcount = 0;
        
        while(loopcount < testcases){
            
            
            int x = sc.getInt();
            String[] nums = new String[x];
            int count = 0;
            
            for(int i = 0;i < x;i++){
                nums[i] = sc.getWord();
            }
            
            Arrays.sort(nums);
            for(int y = 1;y < nums.length;y++){
                if(nums[y].startsWith(nums[y-1])){
                    count++;
                    break;
                }}
             if(count > 0){
                    sc.println("NO");
                    loopcount++;
                }else{
                    sc.println("YES");
                    loopcount++;
                }
            sc.flush();
        }
        sc.close();
}}
