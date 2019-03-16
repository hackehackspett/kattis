using System;

    class Kattis
    {
        static void Main(string[] args){
            Scanner sc = new Scanner();
            int pointsPerEdge = 2;
            int n = sc.NextInt();

            for(int i = 0;i<n;i++){
                pointsPerEdge = pointsPerEdge + (pointsPerEdge-1);
            }
            Console.WriteLine(pointsPerEdge*pointsPerEdge);
    }
}