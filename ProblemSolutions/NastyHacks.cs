using System;
using System.Collections.Generic;

    class Kattis
    {
        static void Main(string[] args){
            Scanner sc = new Scanner();
            int n = sc.NextInt();
            
            for(int i = 0; i<n;i++){
                int r = sc.NextInt();
                int e = sc.NextInt();
                int c = sc.NextInt();

                if(e > r && e-r > c){
                    Console.WriteLine("advertise");
                }else if(e-r == c){
                    Console.WriteLine("does not matter");
                }else{
                    Console.WriteLine("do not advertise");
                }
            }
    }
}