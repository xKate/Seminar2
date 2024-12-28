//Реализуйте метод removeAllOccurrences в классе DequeTasks, который
//принимает Deque<String> и строку value. Метод должен удалить все
//вхождения строки value из очереди.

import java.util.Deque;

public class task5 {
   public static void removeAllOccurrences(Deque<String> deque,
String value) {
    
        deque.removeIf(element -> element.equals(value));
        System.out.println(deque);
    } 
}
