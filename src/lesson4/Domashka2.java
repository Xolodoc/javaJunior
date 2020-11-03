package lesson4;
// реализовать сравнение 2-х массивов
public class Domashka2 {
    public static void main(String[] args) {
        int [] a = {1, 2, 8};
        int [] b = {5, 6};

        System.out.println(a.equals(b));

 // получим результат false. Ведь будет вызван метод Object.equals(),
        // который сравнивает ссылки. А они, естественно, разные!
    }

}
