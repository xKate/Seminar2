import java.util.Arrays;

public class Printer {
    public static void main(String[] args) {
        int[] a;
        if (args.length == 0) {
    // При отправке кода на Выполнение, вы можете варьировать
    //эти параметры
            a = new int[]{-1, 2, -3, 4, -5, 6};
        } else {
            a = Arrays.stream(args[0].split(",")).mapToInt(Integer::parseInt).toArray();
    }
    Task1 answer = new Task1();
    String itresume_res =
Arrays.toString(answer.filterNegative(a));
    System.out.println(itresume_res);
    }
}
