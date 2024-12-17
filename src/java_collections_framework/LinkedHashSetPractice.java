package java_collections_framework;

import java.util.*;

// It maintains the insertion order, with the help of the linked-list.
public class LinkedHashSetPractice {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        Set<Integer> set = new LinkedHashSet<>(list);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(2);
        set.add(0);
//        for (int val : set) {
//            System.out.println(val);
//        }
        set.remove(3);
        System.out.println(set);
        System.out.println("-----");
        Set<Integer> set1 = new LinkedHashSet<>(Arrays.asList(4, 5, 6, 7, 8));
        System.out.print(set);
        System.out.println(set1);
//        Intersection
        set.retainAll(set1);
//        Set Difference (Remove all the intersection elements)
//        set.removeAll(set1);
//        Union
//        set.addAll(set1);
        System.out.println("---- After Retaining ----");
        System.out.print(set);
        System.out.println(set1);
    }
}
