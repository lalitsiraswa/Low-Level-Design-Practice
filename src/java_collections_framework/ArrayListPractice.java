package java_collections_framework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListPractice {
    public static void main(String[] args) {
        List<Integer> aList = new ArrayList<>();
        aList.add(2);
        aList.add(4);
        aList.add(6);
        aList.add(8);

        Iterator<Integer> iterator = aList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("-----");

        System.out.println("Element that got replaced : " + aList.set(0, 1));
        System.out.println("Element that got replaced : " + aList.set(1, 2));
        System.out.println("Element that got replaced : " + aList.set(2, 3));
        System.out.println("Element that got replaced : " + aList.set(3, 4));

        System.out.println("-----");
//        aList.set(4, 5); // Index 4 out of bounds for length 4
        for (Integer x : aList) {
            System.out.println(x);
        }
        System.out.println("-----");
        System.out.println(aList);
        System.out.println("-----");

//        We can pass here any collection (Set, ArrayList)
        List<Integer> aList2 = new ArrayList<>(aList);
//        List<Integer> aList2 = aList; // It references to the aList only.
        aList2.set(0, 25);
        System.out.println(aList);
        System.out.println(aList2);

        System.out.println("-----");
        List<Integer> aList3 = new ArrayList<>();
        aList3.add(4);
        aList3.add(5);
        aList3.add(6);
        aList3.addAll(aList);
        System.out.println(aList3);

        System.out.println("-----");
        System.out.println("Index Of 10 : " + aList3.indexOf(10));
        System.out.println("Index Of 6 : " + aList3.indexOf(6));

        System.out.println("-----");
        List<Integer> aList4 = new ArrayList<>(List.of(1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5));
        System.out.println(aList4);
        System.out.println("Last index of 1 : " + aList4.lastIndexOf(1));
        System.out.println("Last index of 4 : " + aList4.lastIndexOf(4));

        System.out.println("-----");
//        fromIndex is Inclusive but toIndex is exclusive
//        subList() method always creates a 'shallow copy'
        List<Integer> subList = aList4.subList(3, 8);
        subList.set(0, 100);
        System.out.println(subList);
        System.out.println(aList4);

        System.out.println("-----");
        List<Integer> aList5 = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(aList5);
    }
}
