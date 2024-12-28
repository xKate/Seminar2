import java.util.LinkedList;

public class Printer {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        if (args.length == 0) {
        // При отправке кода на Выполнение, вы можете
        //варьировать эти параметры
            ll.add("apple");
            ll.add("banana");
            ll.add("pear");
            ll.add("grape");
        } else {
            for (String arg : args) {
                ll.add(arg);
            }
        }
        task1 answer = new task1();
        System.out.println(ll);
        answer.removeOddLengthStrings(ll);
        System.out.println(ll);
    }
}

