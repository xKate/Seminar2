public class Printer2 {

    public static void main(String[] args) {
        task2 stack = new task2();
        if (args.length == 0) {
                // При отправке кода на Выполнение, вы можете варьировать
                //эти параметры
            stack.push("apple");
            stack.push("banana");
            stack.push("pear");
            stack.push("grape");
        } else {
            for (String arg : args) {
                stack.push(arg);   
            }
        }
        System.out.println(stack.getElements());
        System.out.println(stack.pop());
        System.out.println(stack.getElements());
        System.out.println(stack.peek());
    }
}
