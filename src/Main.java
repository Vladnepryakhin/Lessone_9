import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Student> students = new HashSet<>();

        students.add(new Student("Иван Иванов", "Группа 101", 1,
                Map.of("Математика", 4, "Физика", 3, "История", 5)));

        students.add(new Student("Петр Петров", "Группа 102", 1,
                Map.of("Математика", 2, "Физика", 2, "История", 3)));

        students.add(new Student("Мария Сидорова", "Группа 201", 2,
                Map.of("Математика", 5, "Физика", 5, "История", 5)));

        students.add(new Student("Анна Кузнецова", "Группа 202", 2,
                Map.of("Математика", 3, "Физика", 2, "История", 2)));

        System.out.println("Все студенты:");
        students.forEach(System.out::println);

        Student.removeUnderperformingStudents(students);
        System.out.println("\nПосле удаления неуспевающих:");
        students.forEach(System.out::println);

        Student.promoteStudents(students);
        System.out.println("\nПосле перевода на следующий курс:");
        students.forEach(System.out::println);

        Student.printStudents(students, 2);
    }
}
