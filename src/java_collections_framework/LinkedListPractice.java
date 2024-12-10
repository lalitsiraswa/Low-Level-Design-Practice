package java_collections_framework;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListPractice {
    public static void main(String[] args) {
        List<Integer> llist = new LinkedList<>();
        llist.add(1);
        llist.add(2);
        llist.add(3);

        ListIterator<Integer> listIterator = llist.listIterator();
//        next() will first return the current index element then shifted to the next index
//        next : return list[index++]
        System.out.println(listIterator.next());
        System.out.println(listIterator.hasNext());
        System.out.println(listIterator.next());
//        previous() will first shifted to the previous index and then return the element
//        previous : return list[--index];
        System.out.println(listIterator.previous());
        System.out.println(listIterator.hasNext());
        System.out.println(listIterator.next());

        System.out.println("-----");
        Integer[] arr = llist.toArray(new Integer[0]);
        for (Integer integer : arr) {
            System.out.println(integer);
        }

        System.out.println("-----");
        ListIterator<Integer> iterator = llist.listIterator(llist.size());
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
    }
}
