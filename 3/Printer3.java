import java.util.Arrays;

public class Printer3 {
    public static void main(String[] args) {
    String[] arr;
    if (args.length == 0) {
    // При отправке кода на Выполнение, вы можете варьировать
    //эти параметры
        arr = new String[]{"cat", "elephant", "dog", "giraffe"};
    } else {
        arr = args[0].split(", ");
    }
    Task3 answer = new Task3();
    String itresume_res = Arrays.toString(answer.filterShortStrings(arr));
    System.out.println(itresume_res);
    }
}
