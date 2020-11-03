package lesson6;

import java.util.Random;
import java.util.Scanner;

public class Dz2 {
    private static Object Random;

    public static void main(String[] args) {

      /* пользователь с консоли задает сколько ему лет. Вывести сообщение кто он
      (ребёнок, подросток, взрослый, пожилой)
       */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Сколько вам лет?");
        int ageFromVvod = scanner.nextInt();

        if (ageFromVvod >= 0 && ageFromVvod <= 13) {
            System.out.println("Ребёнок");
        }
        if (ageFromVvod >= 14 && ageFromVvod <= 17) {
            System.out.println("Подросток");
        }
        if (ageFromVvod >= 18 && ageFromVvod <= 59) {
            System.out.println("Взрослый");
        }
        if (ageFromVvod >= 60) {
            System.out.println("Пожилой");
        }


    }
}
