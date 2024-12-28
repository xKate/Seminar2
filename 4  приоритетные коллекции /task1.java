import java.util.LinkedList;

public class task1 {

    public static void
    removeOddLengthStrings(LinkedList<String> ll) {
        LinkedList<String> toRemove = new LinkedList<>();
        for (String s : ll){
            if (s.length() % 2 !=0){
                toRemove.add(s);
            }
        }
        ll.removeAll(toRemove);
    }
}
    // Не удаляйте этот класс - он нужен для вывода результатов на
    //экран и проверки

