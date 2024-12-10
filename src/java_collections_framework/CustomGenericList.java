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
        return null;
    }
}

public class CustomGenericList {
    public static void main(String[] args) {
        OurGenericList<Integer> list = new OurGenericList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        for (int x : list) {

        }
    }
}
