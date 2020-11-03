package homework2;

public class Domashkaб {
    public static void main(String[] args) {
        int summa = 0;
        for (int i = 500; i <= 1000; i++){
            if (i % 7 == 0 && i % 19 == 0) {
                summa += i;
            }
        }
        System.out.println(summa);
    }
}
