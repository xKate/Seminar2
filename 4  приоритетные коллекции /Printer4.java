import java.util.Deque;
import java.util.LinkedList;

public class Printer4 {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        int n;
        if (args.length < 1) {
        // При отправке кода на Выполнение, вы можете
        //варьировать эти параметры
            deque.add(1);
            deque.add(2);
            deque.add(3);
            deque.add(4);
            n = 3;
        } else {
            for (int i = 0; i < args.length - 1; i++) {
                deque.add(Integer.parseInt(args[i]));
            }
            n = Integer.parseInt(args[args.length - 1]);
        }
        task4.rotateDeque(deque, n);
    }
}
