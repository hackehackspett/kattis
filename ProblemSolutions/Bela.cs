using System;
using System.Collections.Generic;

    class Kattis
    {
        static void Main(string[] args){
            Scanner sc = new Scanner();
            Dictionary<char, int> cardValues = new Dictionary<char, int>();
            cardValues.Add('A',11);
            cardValues.Add('K',4);
            cardValues.Add('Q',3);
            cardValues.Add('J',2);
            cardValues.Add('T',10);
            cardValues.Add('9',0);
            cardValues.Add('8',0);
            cardValues.Add('7',0);

            int n = sc.NextInt();
            char b = char.Parse(sc.Next());
            int points = 0;

            for(int i = 0;i<4*n;i++){
                String card = sc.Next();
                char cardNum = card[0];
                char cardSuit = card[1];
                int value;
                cardValues.TryGetValue(cardNum,out value);
                if(b == cardSuit && cardNum == 'J'){
                    value = 20;
                }else if(b == cardSuit && cardNum == '9'){
                    value = 14;
                }
                points = points + value;
            }
            Console.WriteLine(points);
    }
}