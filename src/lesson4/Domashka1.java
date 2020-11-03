package lesson4;
// реализовать поиск минимального элемента в массиве
import java.util.Arrays;

public class Domashka1 {
    public static void main(String[] args) {
        int[] a = {10, 34, 51, 10, 7};

       Arrays.sort (a);

        System.out.println("min = " + a[0]);

    }
}
