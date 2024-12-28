import java.util.Arrays;

public class Printer4 {
    public static void main(String[] args) {
        int[] a;
        if (args.length == 0) {
        // При отправке кода на Выполнение, вы можете варьировать
        //эти параметры
            a = new int[]{4, 2, 7, 5, 1};
        } else {
            a = Arrays.stream(args[0].split(",")).mapToInt(Integer::parseInt).toArray();
        }
        Task4 answer = new Task4();
        int result = answer.calculateAverage(a);
        System.out.println(result);
    }
}
