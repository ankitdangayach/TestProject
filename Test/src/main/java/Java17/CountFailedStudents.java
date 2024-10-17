package Java17;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountFailedStudents {
    public record Student(int id, String deptName, int marks) {
    }

    public static void main(String[] args) {
        List<Student> studentList = Arrays.asList(
                new Student(1, "Computer Science", 45),
                new Student(2, "Electrical", 55),
                new Student(3, "Computer Science", 30),
                new Student(4, "Mechanical", 70),
                new Student(5, "Electrical", 40),
                new Student(6, "Computer Science", 25)
        );

        Map<String, Long> failedCount = studentList.stream().filter(student -> student.marks < 50)
                .collect(Collectors.groupingBy(Student::deptName, Collectors.counting()));
        failedCount.forEach((dept, count) -> System.out.println("Department: " + dept + ", Failed students " + count));
    }
}
