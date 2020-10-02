package ru.geekbrains.yukjdev;

import java.util.ArrayList;
import java.util.Arrays;

public class SwitchArr<T>{

    public void swap (String[] arr, int index1, int index2) {
        String tmp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = tmp;
    }

    public static <T> ArrayList<T> toArrayList(T[] arr) {
        return new ArrayList<T>(Arrays.asList(arr));
    }

}
