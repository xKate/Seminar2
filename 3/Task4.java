//Напишите метод, который принимает массив целых чисел и возвращает
//среднее значение элементов массива, округленное до ближайшего целого
//числа
public class Task4 {
    public static int calculateAverage(int[] a) {
        if (a.length == 0) return 0;
        int sum = 0;
        for (int num : a) {
            sum += num;
        }
        return (int) Math.round((double) sum / a.length);
    }
}
