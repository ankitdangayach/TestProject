package Java17;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortingListInJavaFirstByAgeAndThenByID {

    public record Employee(String name, int id, int age) {
    }

    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(
                new Employee("Kathy", 24, 25000),
                new Employee("George", 10, 10000),
                new Employee("Robert", 12, 15000),
                new Employee("Hat", 25, 15000)
        );

        sortingListInJavaFirstByAgeAndThenByID(employeeList);
    }

    public static void sortingListInJavaFirstByAgeAndThenByID(List<Employee> employeeList) {
        employeeList.stream().sorted(Comparator.comparing(Employee::age).thenComparingInt(Employee::id)).forEach(System.out::println);
        /*employeeList.forEach(System.out::println);*/
    }
}
