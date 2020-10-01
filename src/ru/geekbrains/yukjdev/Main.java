package ru.geekbrains.yukjdev;

import java.util.ArrayList;
import java.util.Arrays;

import static ru.geekbrains.yukjdev.SwitchArr.toArrayList;

public class Main  {

//1. Написать метод, который меняет два элемента массива местами.(массив может быть любого ссылочного типа);
//2. Написать метод, который преобразует массив в ArrayList;
//3. Большая задача:
//
//    a. Есть классы Fruit -> Apple, Orange;(больше фруктов не надо)
//    b. Класс Box в который можно складывать фрукты, коробки условно сортируются по типу фрукта, поэтому в одну
//    коробку нельзя сложить и яблоки, и апельсины;
//    c. Для хранения фруктов внутри коробки можете использовать ArrayList;
//    d. Сделать метод getWeight() который высчитывает вес коробки, зная количество фруктов
//    и вес одного фрукта(вес яблока - 1.0f, апельсина - 1.5f, не важно в каких это единицах);
//    e. Внутри класса коробка сделать метод compare, который позволяет сравнить текущую коробку с той,
//    которую подадут в compare в качестве параметра, true - если их веса равны, false в противном
//    случае(коробки с яблоками мы можем сравнивать с коробками с апельсинами);
//    f. Написать метод, который позволяет пересыпать фрукты из текущей коробки
//    в другую коробку(помним про сортировку фруктов, нельзя яблоки высыпать в коробку с апельсинами),
//    соответственно в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые
//    были в этой коробке;
//    g. Не забываем про метод добавления фрукта в коробку.





    public ArrayList<String[]> convertStringArr(String[][] resultArr) {

        ArrayList<String[]> arrRet = new ArrayList<>();
        int i = 0;
        //   int j = 0;
        for (String[] anArr : resultArr) {
            arrRet.add(i, anArr);
            //       j++;
            i++;
        }
        return arrRet;
    }



    public static void main(String[] args) {
	// write your code here
        SwitchArr<String> switchArr = new SwitchArr<>();
        String[] arrStrElem = {"a", "b"};
        System.out.println(Arrays.deepToString(arrStrElem));
        switchArr.swap(arrStrElem, 0, 1);
        System.out.println(Arrays.deepToString(arrStrElem));

        ArrayList<String> arrayList = toArrayList(arrStrElem);
        System.out.println(arrayList);

        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();

        Orange orange1 = new Orange();
        Orange orange2 = new Orange();
        Orange orange3 = new Orange();

        Box<Apple> box1 = new Box<>();
        Box<Orange> box2 = new Box<>();
        Box<Fruit> box3 = new Box<>();

        box1.add(apple1);
        box1.add(apple2);
        box1.add(apple3);

        box2.add(orange1);
        box2.add(orange2);
        box2.add(orange3);

        System.out.println(box1.compare(box2));
        System.out.println(box1.getWeight());

        box2.remove(orange1);

        System.out.println(box1.compare(box2));
        System.out.println(box2.getWeight());

        box2.transfer(box3);
        box1.transfer(box3);
        System.out.println(box3.getFruits());
    }

}
