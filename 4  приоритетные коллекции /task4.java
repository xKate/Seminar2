//Реализуйте метод rotateDeque в классе DequeTasks, который принимает
//Deque<Integer> и число n. Метод должен повернуть очередь вправо на n
//позиций. Если n отрицательное, повернуть влево.

import java.util.Deque;

public class task4 {

    public static void rotateDeque(Deque<Integer> deque, int n) {
        if (deque.isEmpty()) return;
        int size = deque.size();
        n = n % size;
        if (n < 0) {
            n += size;
        }
        for (int i = 0; i < n; i++) {
            deque.addLast(deque.removeFirst());
        }
        System.out.println(deque);
    }
}