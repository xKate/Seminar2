//Дан массив объектов, где каждый объект представляет собой строку данных, и
//массив заголовков. Создайте строку CSV, где строки данных разделяются новой
//строкой, а значения в строках разделяются запятыми
public class CSVGenerator {
    public static String generateCSV(String[] headers, String[][]
    data) {
    StringBuilder csv = new StringBuilder();
    // Добавление заголовков
    csv.append(String.join(",", headers)).append("\n");
    // Добавление данных
    for (String[] row : data) {
    csv.append(String.join(",", row)).append("\n");
    }
    return csv.toString().trim(); // Удалить последнюю новую строку
    }
}

