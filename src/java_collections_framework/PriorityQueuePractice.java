package java_collections_framework;

import java.util.*;

class StudentsMarks implements Comparable<StudentsMarks> {
    private int maths;
    private int physics;

    public StudentsMarks(int maths, int physics) {
        this.maths = maths;
        this.physics = physics;
    }

    public int getMaths() {
        return maths;
    }

    public int getPhysics() {
        return physics;
    }

    @Override
    public String toString() {
        return "StudentsMarks{" +
                "maths=" + maths +
                ", physics=" + physics +
                '}';
    }

    @Override
    public int compareTo(StudentsMarks obj) {
//        current object < other object
//                return -1;
//        current object > other object
//                return 1;
//        current object == other object
//                return 0;
//        -----
//        if (this.maths < obj.maths) {
//            return -1;
//        }
//        if (this.maths > obj.maths) {
//            return 1;
//        }
//        return 0;
//        -----
//        return this.maths - obj.maths;
//        -----
        System.out.println("obj.maths : " + obj.maths + " , this.maths : " + this.maths);
        return obj.maths - this.maths;
    }
}

public class PriorityQueuePractice {
    public static void main(String[] args) {
        Queue<Integer> priorityQueue = new PriorityQueue<>();
//        Queue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
        priorityQueue.offer(1);
        priorityQueue.offer(2);
        priorityQueue.offer(0);
        priorityQueue.offer(100);
        System.out.println(priorityQueue);

//        bottom 2 elements
        List<Integer> bottom2 = new ArrayList<>();
        int index = 0;
        while (!priorityQueue.isEmpty()) {
            if (index == 2) {
                break;
            }
            bottom2.add(priorityQueue.poll());
            index++;
        }
        System.out.println(bottom2);
        System.out.println(priorityQueue);

        System.out.println("-----");
//        What if we want top2 elements instead of bottom2
//        get me the top 3 students according to their maths marks?
        List<StudentsMarks> studentsMarksList = new ArrayList<>();
        studentsMarksList.add(new StudentsMarks(70, 80));
        studentsMarksList.add(new StudentsMarks(38, 10));
        studentsMarksList.add(new StudentsMarks(87, 86));
        studentsMarksList.add(new StudentsMarks(40, 76));
        studentsMarksList.add(new StudentsMarks(56, 78));
        studentsMarksList.add(new StudentsMarks(42, 56));
        PriorityQueue<StudentsMarks> studentPriorityQueue = new PriorityQueue<>(studentsMarksList);
        List<StudentsMarks> top3Students = new ArrayList<>();
        index = 0;
        while (!studentPriorityQueue.isEmpty()) {
            if (index == 3) {
                break;
            }
            top3Students.add((studentPriorityQueue.poll()));
            index++;
        }
        System.out.println(top3Students);
//        System.out.println(studentPriorityQueue);
    }
}
