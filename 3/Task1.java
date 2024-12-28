//Реализуйте метод, который принимает на вход целочисленный массив и
//удаляет все отрицательные числа. Метод должен вернуть массив, содержащий
//только неотрицательные числа.

import java.util.ArrayList;

public class Task1 {
    public static int[] filterNegative(int[] a) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int num : a) {
            if (num >= 0) {
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
            
