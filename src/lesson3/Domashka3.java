package lesson3;
// Есть массив цифр = 12,4,4,23,5,7. Вывести из него только четные цифры.
public class Domashka3 {
    public static void main(String[] args) {
        int[] chisla = {12, 4, 4, 23, 5, 7};
        for (int i = 0; i < chisla.length; i ++) {
            if (chisla [i] % 2 == 0) {
//вывел через 1 числа массива
                System.out.println(chisla[i]);
            }
        }
    }

}