package lesson3;
//Есть массив символов = в,е,ц,п,ы,н. Вывести все символы в обратном порядке.
public class Domashka2 {
    public static void main(String[] args) {
        String[] bukvy = {"в", "е", "ц", "п", "ы", "н" };
        for (int i = bukvy.length - 1; i >= 0; i--) {
            System.out.println(bukvy[i]);
        }
    }
}