package java_collections_framework;

import java.util.Iterator;

class OurGenericList<T> implements Iterable<T> {
    private T[] items;
    private int size;

    public OurGenericList() {
        this.size = 0;
        items = (T[]) new Object[20];
    }

    public void add(T item) {
        items[size] = item;
        size += 1;
    }

    public T getItemAtIndex(int index) {
        if (index < size) {
            return items[index];
        }
        return null;
    }

    @Override
    public Iterator<T> iterator() {
        return new OurGenericListIterator(this);
    }

    private class OurGenericListIterator implements Iterator<T> {
        private OurGenericList<T> list;
        private int index = 0;

        public OurGenericListIterator(OurGenericList<T> list) {
            this.list = list;
        }

        @Override
        public boolean hasNext() {
            System.out.println(Thread.currentThread().getName() + " hasNext Call");
            return index < list.size;
        }

        @Override
        public T next() {
            System.out.println(Thread.currentThread().getName() + " Next Call");
            return list.items[index++];
        }
    }
}

public class CustomGenericList {
    public static void main(String[] args) {
        OurGenericList<Integer> list = new OurGenericList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("-----");
        // The Enhance For Loop Is Also Calling The 'next()' And 'hasNext()' Method.
        for (Integer item : list) {
            System.out.println(item);
        }
    }
}
