package com.yk.pack6Generics;

public class Less26List<T> {

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

}
