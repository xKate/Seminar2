//Реализуйте метод countOccurrences в классе ListUtils, который
//принимает LinkedList<String> и строку, и возвращает количество
// вхождений строки в список.

import java.util.LinkedList;

public class task3 {
    public static int countOccurrences(LinkedList<String> list,
    String value) {
    int count = 0;
    for (String s : list) {
        if (s.equals(value)) {
        count++;
        }
    }
        return count;
    }
}
