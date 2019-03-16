using System;
    class Kattis
    {
        static void Main(string[] args){
            String[] line = Console.ReadLine().Split(' ');
            int[] n = new int[]{1,1,2,2,2,8};
            for(int i =0;i<6;i++){
               Console.Write(n[i]-int.Parse(line[i])+" ");
           } 
    }
}