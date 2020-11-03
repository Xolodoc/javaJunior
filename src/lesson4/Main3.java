package lesson4;

public class Main3 {
    public static void main(String[] args) {
        int [] numbers = {1, 4, 0, 8, 98, 198, 76, 78, 98};
        //найти индекс элемента
        int test = 198;
        int index = - 1; // -1 - означает, что элемент ещё не найден(-1 самое маленькое число) //2;

        for (int i = 0; i < numbers.length; i++){
            System.out.println("step:" + i);
            if (test == numbers[i]){
                index = i;
                break;
            }
        }
        System.out.println("index =" + index);


    }
}
