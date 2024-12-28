//Реализуйте метод, который принимает на вход массив строк и возвращает
//новый массив, содержащий только строки, длина которых больше 3 символов.

import java.util.ArrayList;

public class Task3 {
    public static String[] filterShortStrings(String[] arr) {
        ArrayList<String> result = new ArrayList<>();
        for (String s : arr) {
            if (s.length() > 3) {
            result.add(s);
            }
        }
            // Преобразуем ArrayList в массив
        String[] resultArray = new String[result.size()];
        for (int i = 0; i < result.size(); i++) {
            resultArray[i] = result.get(i);
        }
        return resultArray;
    }
}
