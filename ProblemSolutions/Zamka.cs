using System;
using System.Collections.Generic;

    class Kattis
    {
        static void Main(string[] args){
            Scanner sc = new Scanner();
            int l = sc.NextInt();
            int d = sc.NextInt();
            int x = sc.NextInt();
            String s;
            int n = 0;
            int m = 0;

            for(int i = l;i<=d;i++){
                int tmp = 0;
                s = i.ToString();
                char[] c = s.ToCharArray();
                foreach(char digit in c){
                    tmp = tmp + int.Parse(digit.ToString());
                }
                if(tmp == x){
                    n = i;
                    break;
                }
            }

            for(int i = d;i>=l;i--){
                int tmp = 0;
                s = i.ToString();
                char[] c = s.ToCharArray();
                foreach(char digit in c){
                    tmp = tmp + int.Parse(digit.ToString());
                }
                if(tmp == x){
                    m = i;
                    break;
                }
            }
            Console.WriteLine(n);
            Console.WriteLine(m);
    }
}