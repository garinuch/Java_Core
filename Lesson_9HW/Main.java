package Lesson_9HW;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student("Oleg", Arrays.asList(
                new Course("MATH"),
                new Course("Biology"))));
        studentList.add(new Student("Anton", Arrays.asList(
                new Course("BIOLOGY"),
                new Course("GEOGRAPHY"))));
        studentList.add(new Student("Oksana", Arrays.asList(
                new Course("GEOGRAPHY"),
                new Course("MATH"))));
        studentList.add(new Student("Aleksey", Arrays.asList(
                new Course("TESTING"),
                new Course("Biology"))));
        studentList.add(new Student("Andrey", Arrays.asList(
                new Course("GEOGRAPHY"),
                new Course("TESTING"))));
        studentList.add(new Student("Oleg", Arrays.asList(
                new Course("MATH"),
                new Course("TESTING"))));
        studentList.add(new Student("Vera", Arrays.asList(
                new Course("GEOGRAPHY"),
                new Course("Biology"))));

        System.out.println(studentList.stream()
                .map(s -> s.getCourses())
                .flatMap(f -> f.stream())
                .collect(Collectors.toList()));

        Arrays students;
        System.out.println(studentList.stream()
                .sorted((s1, s2) -> s2.getCourses().size() - s1.getCourses().size())
                .limit(2)
                .collect(Collectors.toList()));

        Course course = new Course("GEOGRAPHY");
        System.out.println(studentList.stream()
                .filter(s -> s.getCourses().contains(course))
                .collect(Collectors.toList()));

    //==========================================================
        Stream<String> citiesStream = Stream.of("Париж", "Лондон", "Мадрид", "Берлин", "Брюссель");
        citiesStream.forEach(System.out::println);
    //========================================================
//  Вывод всех студентов.
        Stream<List<Student>> res = Stream.of(studentList);
        studentList.forEach(System.out::println);

    //==========================================================
        List<Student> StudentsList = studentList.stream().distinct().collect(Collectors.toList());
        System.out.println("Уникальный список данных = "+ StudentsList);
    //===========================================================
//  Вывод каждое 2ое значение.
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        numbers.stream()
                .filter(i -> i % 2 == 0)
                .forEach(System.out::println);
// Вывод студентов по именам.
        studentList.stream()
                .map(Student::getName)
                .forEach(System.out::println);
    }
}
