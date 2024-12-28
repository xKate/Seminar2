import java.util.Arrays;

public class Printer2 {
    public static void main(String[] args) {
        int[] a;
        if (args.length == 0) {
    // При отправке кода на Выполнение, вы можете варьировать
    //эти параметры
            a = new int[]{1, 2, 2, 3, 4, 4, 5};
        } else {
            a = Arrays.stream(args[0].split(",")).mapToInt(Integer::parseInt).toArray();
        }
        Task2 answer = new Task2();
        String itresume_res = Arrays.toString(answer.getUniqueElements(a));
        System.out.println(itresume_res);
}
}
