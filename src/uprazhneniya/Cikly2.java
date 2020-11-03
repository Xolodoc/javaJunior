package uprazhneniya;
//Посчитаем выражение 1-2+3-4+5-6
public class Cikly2 {
    public static void main(String[] args) {
// заведем переменную, в которой будем накапливать результат:
        int sum = 0;
        int znak = 1;
// чтобы получить смену знака будем умножать znak  на -1
        for (int i = 1; i <= 6; i ++)  {
            sum += znak*i;
            znak *= -1; // меняем знак, с -1 на 1 и обратно каждый оборот цикла
        }

        System.out.println (sum);



    }
}
