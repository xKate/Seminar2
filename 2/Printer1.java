public class Printer1 {
    public static void main(String[] args) {
            String[] headers = {};
            String[][] data = {};
            if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете
            //варьировать эти параметры
                headers = new String[]{"Name", "Age", "City"};
                data = new String[][] {
                    {"John", "30", "New York"},
                    {"Alice", "25", "Los Angeles"},
                    {"Bob", "35", "Chicago"}
                };
            } else {
            // Преобразование строковых параметров в массивы
            // Пример обработки данных можно дополнить в
            //зависимости от формата args
            }
            CSVGenerator ans = new CSVGenerator();
            System.out.println(ans.generateCSV(headers, data));
    }   
}