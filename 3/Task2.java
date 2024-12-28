//Напишите метод, который принимает целочисленный массив и возвращает
//новый массив, содержащий только уникальные элементы из исходного
//массива.

import java.util.ArrayList;

public class Task2 {
    public static int[] getUniqueElements(int[] a) {
    ArrayList<Integer> result = new ArrayList<>();
    for (int num : a) {
        if (!result.contains(num)) {
        result.add(num);
        }
    }
    // Преобразуем ArrayList в массив
    int[] resultArray = new int[result.size()];
    for (int i = 0; i < result.size(); i++) {
        resultArray[i] = result.get(i);
    }
    return resultArray;
    }
}
