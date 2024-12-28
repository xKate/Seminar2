import java.util.ArrayList;
import java.util.HashMap;

public class StudentDirectory {
    private HashMap<String, ArrayList<Integer>> studentMap = new
HashMap<>();
//Добавляет или обновляет запись о студенте
    public void addStudent (String name, Integer grade){
        studentMap.computeIfAbsent (name, k -> new ArrayList<> ()).add(grade);
    }
//Находит оценки студента по имени
    public ArrayList <Integer> findStudent(String name){
        return studentMap.getOrDefault(name, new ArrayList<>());
    }
    //Возвращает весь список студентов
    public HashMap<String, ArrayList<Integer>> getAllStudents() {
        return studentMap;
    }
// Удаляет запись о студенте по имени
    public void removeStudent(String name) {
        studentMap.remove(name);
    }
}