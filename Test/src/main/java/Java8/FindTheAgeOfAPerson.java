package Java8;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class FindTheAgeOfAPerson {

    public static void main(String[] args) {
        LocalDate birthDay = LocalDate.of(1988, 7, 12);
        LocalDate today = LocalDate.now();

        System.out.println(ChronoUnit.YEARS.between(birthDay, today));
    }
}
