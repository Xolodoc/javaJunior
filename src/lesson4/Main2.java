package lesson4;

public class Main2 {
    public static void main(String[] args) {
        int [] numbers = {-1, -10, 99, -8, 5, -8};

        //вывести максимальный результат
        //стратегия выбора минимального значения для максимума
        //int max = Integer.MIN_VALUE;
if (numbers.length == 0) {
    System.out.println("Пустой массив");
    return;
}

        int max = numbers [0];
        int i = 1;
        while (i < numbers.length){
            if (max < numbers [i]){
                max = numbers [i];
            }
            i++;
        }
        System.out.println("max = " + max);

    }
}
