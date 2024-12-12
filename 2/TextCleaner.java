//Дана строка с несколькими строками текста, разделенными переводами строки.
//Напишите метод, который удаляет все пустые строки из текста.
public class TextCleaner {

    public static String removeEmptyLines(String text) {
        String[] lines = text.split("\n");
        StringBuilder cleanedText = new StringBuilder();
        for (String line : lines) {
            if (!line.trim().isEmpty()) {
                if (cleanedText.length() > 0) {
                cleanedText.append("\n");
            }
            cleanedText.append(line);
        }
    }
    return cleanedText.toString();
    }
}

