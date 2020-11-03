package lesson3;

public class Main3 {
    public static void main(String[] args) {
        int[] numbs = new int[10];
        int value = 5;
        for (int i = 0; i < 10; i++) {
            numbs[i] = value;
            value = value + 5;
            System.out.println(numbs[i]);

        }
    }
}
