package lesson3;
// Есть массив цифр = 12,4,4,23,5,7. Вывести на консоль сумму значений всех ячеек.
public class Domashka1 {
    public static void main(String[] args) {
        int[] numbers = {12, 4, 4, 23, 5, 7};
        int sum = 0;
        for (int i = 0; i < 6; i++) {
            sum = sum + numbers [i];
        }
        {
        System.out.println(sum);


    }
}
}
