package lesson7;

/* написать метод, который будет принимать входящим параметром текстовую строку,
и выводить на консоль сумму гласных букв в этой строке
 */
public class HomeWork {
    public static void countGlasnihBukv(String text) {
        //text = "ttnjrk jifjeiuyu"
        char[] glasnieBukvi = {'a', 'e', 'y', 'u', 'i', 'o'};
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            char curentCharFromText = text.charAt(i); //внешний цикл
            for (int j = 0; j < glasnieBukvi.length; j++) { //внутренний цикл
                char curentCharIsGlasnih = glasnieBukvi[j];
                if (curentCharFromText == curentCharIsGlasnih) {
                    count++;

                }
            }


        }
        System.out.println(count);
    }

    /* написать метод, который будет принимать входящим параметром текстовую строку.
    Представим, что это новый пароль. Проверить его на наличие цифры
    и вернуть из метода true или false (подходит нам пароль или нет)
     */
    public static boolean haveNumbersInPassword(String password) {
        //password = "dbcu9798sc"
        char[] numbers = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

        for (int i = 0; i < password.length(); i++) {
            char curentCharFromPassword = password.charAt(i);
            for (int j = 0; j < numbers.length; j++) {
                char curentNumbers = numbers[j];
                if (curentNumbers == curentCharFromPassword) {
                    return true;

                }

            }
        }
        return false;
    }
}