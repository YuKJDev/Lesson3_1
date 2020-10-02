package ru.geekbrains.yukjdev;

import java.util.ArrayList;

class Box<T extends Fruit> {
    private ArrayList<T> fruits;

    public Box() {
        this(new ArrayList<>());
    }

    public Box(ArrayList<T> fruits) {
        this.fruits = fruits;
    }

    public void add(T fruit) {
        fruits.add(fruit);

    }


    public void remove(T... fruits) {
        for (T fruit : fruits) {
            this.fruits.remove(fruit);
        }
    }

    public ArrayList<T> getFruits() {
        return new ArrayList<T>(fruits);
    }

    public void clear() {
        fruits.clear();
    }

    public float getWeight() {
        if (fruits.size() == 0) return 0;
        float weight = 0;
        for (T fruit : fruits) weight += fruit.getWeight();
        return weight;
    }

    public boolean compare(Box box) {
        return this.getWeight() == box.getWeight();
    }

    public void transfer(Box<? super Fruit> box) { //разобрался
        box.fruits.addAll(fruits);
        clear();

    }


}