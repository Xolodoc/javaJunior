package lesson13;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        long startTime1 = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            arrayList.add("PlistToMeatYou" + i);
        }
        long endTime1 = System.currentTimeMillis();
        System.out.println("Время выполнения  ArrayList add: " + (endTime1 - startTime1));




        LinkedList<String> linkedList = new LinkedList<>();

        long startTime2 = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            linkedList.add("PlistToMeatYou" + i);
        }
        long endTime2 = System.currentTimeMillis();
        System.out.println("Время выполнения  ArrayList add: " + (endTime2 - startTime2));







        long startTime3 = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            arrayList.get(i);
        }
        long endTime3 = System.currentTimeMillis();
        System.out.println("Время выполнения  ArrayList add: " + (endTime3 - startTime3));




        long startTime4 = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            linkedList.get(i);
        }
        long endTime4 = System.currentTimeMillis();
        System.out.println("Время выполнения  ArrayList add: " + (endTime4 - startTime4));



    }

}
