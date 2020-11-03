package lesson12.game;

import java.util.concurrent.ThreadLocalRandom;

public class Koloda {
    private Card[] cards = new Card[52];

    public Koloda() {
        cards[0] = new Card("Двойка трефа", 2);
        cards[1] = new Card("Двойка бубна", 2);
        cards[2] = new Card("Двойка черви", 2);
        cards[3] = new Card("Двойка пики", 2);

        cards[4] = new Card("Тройка трефа", 3);
        cards[5] = new Card("Тройка бубна", 3);
        cards[6] = new Card("Тройка черви", 3);
        cards[7] = new Card("Тройка пики", 3);

        cards[8] = new Card("Четверка трефа", 4);
        cards[9] = new Card("Четверка бубна", 4);
        cards[10] = new Card("Четверка черви", 4);
        cards[11] = new Card("Четверка пики", 4);

        cards[12] = new Card("Пятерка трефа", 5);
        cards[13] = new Card("Пятерка бубна", 5);
        cards[14] = new Card("Пятерка черви", 5);
        cards[15] = new Card("Пятерка пики", 5);

        cards[16] = new Card("Шестерка трефа", 6);
        cards[17] = new Card("Шестерка бубна", 6);
        cards[18] = new Card("Шестерка черви", 6);
        cards[19] = new Card("Шестерка пики", 6);

        cards[20] = new Card("Семь трефа", 7);
        cards[21] = new Card("Семь бубна", 7);
        cards[22] = new Card("Семь черви", 7);
        cards[23] = new Card("Семь пики", 7);

        cards[24] = new Card("Восемь трефа", 8);
        cards[25] = new Card("Восемь бубна", 8);
        cards[26] = new Card("Восемь черви", 8);
        cards[27] = new Card("Восемь пики", 8);

        cards[28] = new Card("Девять трефа", 9);
        cards[29] = new Card("Девять бубна", 9);
        cards[30] = new Card("Девять черви", 9);
        cards[31] = new Card("Девять пики", 9);

        cards[32] = new Card("Десять трефа", 10);
        cards[33] = new Card("Десять бубна", 10);
        cards[34] = new Card("Десять черви", 10);
        cards[35] = new Card("Десять пики", 10);

        cards[36] = new Card("Валет трефа", 10);
        cards[37] = new Card("Валет бубна", 10);
        cards[38] = new Card("Валет черви", 10);
        cards[39] = new Card("Валет пики", 10);

        cards[40] = new Card("Дама трефа", 10);
        cards[41] = new Card("Дама бубна", 10);
        cards[42] = new Card("Дама черви", 10);
        cards[43] = new Card("Дама пики", 10);

        cards[44] = new Card("Король трефа", 10);
        cards[45] = new Card("Король бубна", 10);
        cards[46] = new Card("Король черви", 10);
        cards[47] = new Card("Король пики", 10);

        cards[48] = new Card("Туз трефа", 11);
        cards[49] = new Card("Туз бубна", 11);
        cards[50] = new Card("Туз черви", 11);
        cards[51] = new Card("Туз пики", 11);
    }
    public Card takeRandomCard(){
        int randomIndex = ThreadLocalRandom.current().nextInt(0, 51 + 1);
        return cards[randomIndex];
    }




}
