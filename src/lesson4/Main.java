package lesson4;

import java.util.Arrays;

//ещё один пример выполнения domashka4
public class Main {
    public static void main(String[] args) {
        int[] numbers = {12, 4, 4, 23, 5, 7};
        //12 < -4, 4 < -4, 4 <-23...
        int first = numbers [0];
        for (int i = 0; i < numbers.length - 1; i++) {
            System.out.println("numbers[" + i + "] " + numbers[i]);
            numbers[i] = numbers[i + 1];
        }
        numbers [numbers.length - 1] = first;
        System.out.println("result = " + Arrays.toString(numbers) + "first = " + first);


    }
}
