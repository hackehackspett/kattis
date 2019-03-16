using System;
    class Kattis
    {
        static void Main(string[] args){
            String[] line = Console.ReadLine().Split(' ');
            int n = int.Parse(line[0]);
            int m = int.Parse(line[1]);

            if(n>m){
                int tmp=n;
                n=m;
                m=tmp;
            }

            for(int i = n+1; i<=m+1; i++){
               Console.WriteLine(i);
           } 
    }
}
