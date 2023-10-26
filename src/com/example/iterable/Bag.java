package com.example.iterable;




import java.util.*;

public class Bag<T> implements Container<T> {

        private ArrayList<T> Bag;

        public Bag(){
            Bag = new ArrayList<>();
        }



    @Override
    public boolean isEmpty() {
        return Bag.isEmpty();
    }

    @Override
    public int size() {
        return Bag.size();
    }

    @Override
    public void add(T item) {
        Bag.add(item);
    }

    @Override
    public Iterator<T> iterator() {
           return null;
    }
    }

