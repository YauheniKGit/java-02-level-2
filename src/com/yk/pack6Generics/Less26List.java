package com.yk.pack6Generics;

import java.util.Iterator;

public class Less26List<T> implements Iterable<T> {

    private T[] objects;
    private int size;

    public Less26List(int initialSize) {
        this.objects = (T[]) new Object[initialSize];
    }

    public void add(T object) {
        objects[size++] = object;
    }

    public T getByIndex(int index) {
        return objects[index];
    }

    public int getSize() {
        return size;
    }

    @Override
    public Iterator<T> iterator() {
        return new ListIterator();
    }

    private class ListIterator implements Iterator<T> {

        private int currentIndex;

        @Override
        public boolean hasNext() {
            return currentIndex < size;
        }

        @Override
        public T next() {
            return objects[currentIndex++];
        }
    }

}
