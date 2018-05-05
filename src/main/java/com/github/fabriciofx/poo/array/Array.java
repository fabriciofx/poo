package com.github.fabriciofx.poo.array;

public final class Array<T> {
    private final T[] elements;

    public Array(final T... elements) {
        this.elements = elements;
    }

    public int length() {
        return elements.length;
    }

    public T get(final int index) {
        return elements[index];
    }

    public void changeAt(final int index) {
        T temp = elements[index];
        elements[index] = elements[index + 1];
        elements[index + 1] = temp;
    }
}
