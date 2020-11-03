package lesson13;

import java.util.ArrayList;
import java.util.Iterator;

public class Main1 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(34);
        numbers.add(22);
        numbers.add(8);

        // 1 способ - с помощью стандартного цикла for
        //numbers.size - длинна коллекции
        for(int i = 0; i < numbers.size(); i++){
            System.out.println(numbers.get(i));
        }

        // 2 способ - for each
        for(Integer num:numbers){
            System.out.println(num);
        }
        // 3 способ - с помощью итератора
        for(Iterator<Integer> iter = numbers.iterator(); iter.hasNext();){
            System.out.println(iter.next());
        }


    }
}
