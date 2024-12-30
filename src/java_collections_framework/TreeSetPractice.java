package java_collections_framework;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetPractice {
    public static void main(String[] args) {
        Set<StudentsMarks> treeSet = new TreeSet<>((s1, s2) -> s2.getPhysics() - s1.getPhysics());
        treeSet.add(new StudentsMarks(70, 80));
        treeSet.add(new StudentsMarks(38, 10));
        treeSet.add(new StudentsMarks(87, 86));
        treeSet.add(new StudentsMarks(40, 76));
        treeSet.add(new StudentsMarks(56, 78));
        treeSet.add(new StudentsMarks(42, 56));

//        Getting the students marks in sorted order
        for (StudentsMarks studentsMark : treeSet) {
            System.out.println(studentsMark);
        }

        Set<Integer> integerSet = new TreeSet<>();
        integerSet.add(10);
        integerSet.add(8);
        integerSet.add(6);
        integerSet.add(4);
        integerSet.add(2);
        integerSet.add(0);
        for (Integer val : integerSet) {
            System.out.println(val);
        }
    }
}
