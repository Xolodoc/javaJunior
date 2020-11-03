package lesson6;
/* объявить массив из 10 цифр.Рандомно сгенерировать 3-х значное число и вывести его
на консоль (вытянуть 3 рандомных числа и склеить их в это число)
 */


import java.util.concurrent.ThreadLocalRandom;

public class DZ1 {
    public static void main(String[] args) {


        int [] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};


        int randomNum1 = ThreadLocalRandom.current().nextInt(0, numbers.length);
        int randomNum2 = ThreadLocalRandom.current().nextInt(0, numbers.length);
        int randomNum3 = ThreadLocalRandom.current().nextInt(0, numbers.length);

        int generatedPassword = numbers[randomNum1] + numbers[randomNum2] + numbers[randomNum3];

        System.out.println(generatedPassword);

    }

}
//выводит 2 числа