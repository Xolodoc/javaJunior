package lesson14;

import lesson14.CollectionUtils;

import java.util.*;

public class CollectionUtilsImpl implements CollectionUtils {

    @Override
    public Collection<Integer> union(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        LinkedList<Integer> result = new LinkedList<>();
        result.addAll(a);
        result.addAll(b);
        return result;
    }

    @Override
    public Collection<Integer> intersection(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        return null; //3434ответ
    }

    @Override
    public Set<Integer> unionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        return null; //1234567ответ
    }

    @Override
    public Set<Integer> intersectionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        Set<Integer> raznost = new HashSet<Integer>(a);
        raznost.addAll(b);
        Set<Integer> tmp = new HashSet<Integer>(a);
        tmp.retainAll(b);
        raznost.removeAll(tmp);

        return raznost; //34 ответ
    }

    @Override
    public Collection<Integer> difference(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        LinkedList<Integer> result = new LinkedList<>();
        for (Integer num : a) {
            if (!b.contains(num)) {
                result.add(num);

            }
        }
        for (Integer num : b) {
            if (!a.contains(num)) {
                result.add(num);
            }
        }

        return result; //12567 ответ метод contains
    }
}
