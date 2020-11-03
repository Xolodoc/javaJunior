package lesson3;
// Есть массив цифр = 12,4,4,23,5,7. Перезаписать значения всех ячеек со сдвигом в влево на 1.
// Получится вот такой массив = 4,4,23,5,7,12. Вывести новый массив на консоль.

//Подсказка по 4му заданию:
// сначала сделайте решение без цикла for.
// А только потом, глядя на решение, придумайте как можно сократить код с помощью цикла for.
public class Domashka4 {
    public static void main(String[] args) {
        int[] numers = {12, 4, 4, 23, 5, 7};
        int[] numerik = {12, 4, 4, 23, 5, 7};
        //   numers[0] = numerik[1];
     //   numers[1] = numerik[2];
     //   numers[2] = numerik[3];
//        numers[3] = numerik[4];
//        numers[4] = numerik[5];
//        numers[5] = numerik[0];{
//            System.out.println(chisla[0]);

        {
            for (int i = 0; i < numers.length; i++) {

                if (i == numers.length - 1) {
                    numers[i] = numerik[0];

                } else {
                    numers[i] = numerik[i + 1];
                    {
                        System.out.println(numers[i]);
                    }
                }
            }


        }

    }
}