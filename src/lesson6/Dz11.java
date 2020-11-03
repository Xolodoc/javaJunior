package lesson6;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Dz11 {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        {


            // формула создания объекта (ссылочного типа)
            int a = 10;
            Scanner scanner = new Scanner(System.in);
            String inputAnswer = scanner.nextLine();

            int randomNum1 = ThreadLocalRandom.current().nextInt(0, numbers.length);
            int randomNum2 = ThreadLocalRandom.current().nextInt(0, numbers.length);
            int randomNum3 = ThreadLocalRandom.current().nextInt(0, numbers.length);

            String generatedPassword = "" + numbers[randomNum1] + numbers[randomNum2] + numbers[randomNum3];

            System.out.println(generatedPassword);
        }
    }
}
