import java.util.Arrays;

public class MergeSort {
    // Метод для объединения двух отсортированных массивов
    public static void merge(int[] left, int[] right, int[] result)
    {
    int i = 0, j = 0, k = 0;
    // Объединение элементов из массива left и right в массив result
    while (i < left.length && j < right.length) {
        if (left[i] <= right[j]) {
            result[k++] = left[i++];
        } else {
            result[k++] = right[j++];
        }
    }
    // Копирование оставшихся элементов из массива left (если есть)
    while (i < left.length) {
        result[k++] = left[i++];
    }
    // Копирование оставшихся элементов из массива right (если есть)
    while (j < right.length) {
        result[k++] = right[j++];
    }
}
    // Метод для рекурсивной сортировки массива
    public static void mergeSort(int[] array) {
        if (array.length < 2) {
            return; // Массив с одним элементом уже отсортирован
    }
    int mid = array.length / 2;
    int[] left = Arrays.copyOfRange(array, 0, mid);
    int[] right = Arrays.copyOfRange(array, mid, array.length);
    // Рекурсивная сортировка двух половин
    mergeSort(left);
    mergeSort(right);
    // Объединение отсортированных половин
    merge(left, right, array);
    }
}
