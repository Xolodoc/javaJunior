package lesson14;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        CollectionUtilsImpl utils = new CollectionUtilsImpl();

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        HashSet<Integer> set = new HashSet<>();
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(6);
        set.add(7);

Collection<Integer> resultUnion = utils.intersectionWithoutDuplicate(list, set);
        System.out.println(resultUnion);





    }
}
