using System;
class Kattis
    {
        static void Main(string[] args){
            int count = 0;
            String n = Console.ReadLine();
            String[] line = Console.ReadLine().Split(' ');
            foreach(String temp in line){
               int tmp = int.Parse(temp);
               if(tmp<0){
                   count++;
               }
           }
            Console.WriteLine(count);
    }
}