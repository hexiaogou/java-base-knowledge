package com.jie.java_container.design_patttern;

import java.util.Arrays;
import java.util.Iterator;

/**
 * @author hexiaogou
 */
public class ReverseArrayCollection<T> implements Iterable<T> {
    private T[] array;

    public ReverseArrayCollection(T... obj) {
        this.array = Arrays.copyOfRange(obj, 0, obj.length);
    }

    @Override
    public Iterator<T> iterator() {
        return new ReverseIterator();
    }

    class ReverseIterator implements Iterator<T> {
        int index;

        public ReverseIterator() {
            this.index = ReverseArrayCollection.this.array.length;
        }

        @Override
        public boolean hasNext() {
            return index > 0;
        }

        @Override
        public T next() {
            index--;
            return array[index];
        }
    }
}
