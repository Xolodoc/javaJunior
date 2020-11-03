package lesson6;
// сервис генерации пароль
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main3 {
    public static void main(String[] args) {
        char[] lowerCaseLeters = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        char[] upperCaseLetters = "abcdefghijklmnopqrstuvwxyz".toUpperCase().toCharArray();
        char[] spetsSimbols = {'!', '&', '*', '^', '(', ')', '%',};
        char[] numbers = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};


        System.out.println("Включать ли цифры в пароль?");

        // формула создания объекта (ссылочного типа)
        int a = 10;
        Scanner scanner = new Scanner(System.in);
        String inputAnswer = scanner.nextLine();
        if (inputAnswer.equals("да")) {
            int randomNum1 = ThreadLocalRandom.current().nextInt(0, lowerCaseLeters.length);
            int randomNum2 = ThreadLocalRandom.current().nextInt(0, lowerCaseLeters.length);
            int randomNum3 = ThreadLocalRandom.current().nextInt(0, upperCaseLetters.length);
            int randomNum4 = ThreadLocalRandom.current().nextInt(0, upperCaseLetters.length);
            int randomNum5 = ThreadLocalRandom.current().nextInt(0, spetsSimbols.length);
            int randomNum6 = ThreadLocalRandom.current().nextInt(0, numbers.length);


            String generatedPassword = "" + upperCaseLetters[randomNum3] + numbers[randomNum6] +
                    lowerCaseLeters[randomNum1] + spetsSimbols[randomNum5] +
                    lowerCaseLeters[randomNum4] + lowerCaseLeters[randomNum2];

            System.out.println(generatedPassword);
        } else {
            int randomNum1 = ThreadLocalRandom.current().nextInt(0, lowerCaseLeters.length);
            int randomNum2 = ThreadLocalRandom.current().nextInt(0, lowerCaseLeters.length);
            int randomNum3 = ThreadLocalRandom.current().nextInt(0, upperCaseLetters.length);
            int randomNum4 = ThreadLocalRandom.current().nextInt(0, upperCaseLetters.length);
            int randomNum5 = ThreadLocalRandom.current().nextInt(0, spetsSimbols.length);
            int randomNum6 = ThreadLocalRandom.current().nextInt(0, upperCaseLetters.length);


            String generatedPassword = "" + upperCaseLetters[randomNum3] + upperCaseLetters[randomNum6] +
                    lowerCaseLeters[randomNum1] + spetsSimbols[randomNum5] +
                    lowerCaseLeters[randomNum4] + lowerCaseLeters[randomNum2];
            System.out.println(generatedPassword);
        }
    }
}