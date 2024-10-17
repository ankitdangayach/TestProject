import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Take input from user till user doesn't press X or x
        int answer = 0;
        while (true) {
            System.out.println("Enter the operator::");
            char operator = in.next().trim().charAt(0);
            if (operator == '+' || operator == '-' || operator == '*' || operator == '/' || operator == '%') {
                System.out.println("You have entered " + operator);
                System.out.println("Enter two numbers::");
                int number1 = in.nextInt();
                int number2 = in.nextInt();
                System.out.println("Input number1::" + number1 + "and number2::" + number2);
                if (operator == '+') {
                    answer = number1 + number2;
                } else if (operator == '-') {
                    answer = number1 - number2;
                } else if (operator == '*') {
                    answer = number1 * number2;
                } else if (operator == '/') {
                    if (number2 != 0) {
                        answer = number1 / number2;
                    } else {
                        System.out.println("Division by zero");
                    }

                } else {
                    answer = number1 % number2;
                }
            } else if (operator == 'x' || operator == 'X') {
                System.out.println("You have entered " + operator);
                break;
            } else {
                System.out.println("Invalid operation");
            }

            System.out.println(answer);
        }

    }
}
