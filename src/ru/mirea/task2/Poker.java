package ru.mirea.task2;

import java.util.Random;

public class Poker {
    private int n;
    private String[] koloda = {"I-ch", "I-bu", "I-pi", "I-kr", "K-ch", "K-bu", "K-pi", "K-kr",
            "Q-ch", "Q-bu", "Q-pi", "Q-kr", "V-ch",
            "V-bu", "V-pi", "V-kr", "10-ch", "10-bu", "10-pi", "10-kr",
            "9-ch", "9-bu", "9-pi", "9-kr", "8-ch", "8-bu",
            "8-pi", "8-kr", "7-ch", "7-bu", "7-pi", "7-kr", "6-ch", "6-bu", "6-pi", "6-kr",
            "5-ch", "5-bu", "5-pi", "5-kr","4-ch", "4-bu", "4-pi", "4-kr", "3-ch", "3-bu",
            "3-pi", "3-kr", "2-ch", "2-bu", "2-pi", "2-kr"};

    public Poker(int n) {
        this.n = n;
    }

    private void peretasovka()
    {
        String[] kolodaT = new String[52];
        int karta;
        Random r = new Random();
        int i = 0;
        while(i < 52)
        {
            karta = r.nextInt(52);
            while (koloda[karta] == null)
            {
                karta++;
                if(karta >= koloda.length) karta = r.nextInt(52);
            }
            kolodaT[i] = koloda[karta];
            koloda[karta] = null;
            i++;
        }
        koloda = kolodaT;
    }

    public void razdacha()
    {
        if (this.n > 10)
        {
            System.out.println("Слишком много игроков!");
            return;
        }
        this.peretasovka();
        for (int i = 0; i < n; i++)
        {
            System.out.print((i + 1) + "-й Игрок:");
            for(int j = i * 5; j < (i + 1) * 5; j++) System.out.print(' ' + koloda[j]);
            System.out.print('\n');
        }
    }
}
