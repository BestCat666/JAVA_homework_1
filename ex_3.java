
//Реализовать простой калькулятор (пользователь вводит 2 числа и вводит операцию (+ - / *). int a ; int b; String op (op!=”Stop”); (char != ’b’)
import java.util.Scanner;

public class ex_3 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        double a = iScanner.nextDouble();
        System.out.println("Введите второе число: ");
        double b = iScanner.nextDouble();
        System.out.println("Введите операцию: ");
        // String operation = iScanner.nextLine();
        char operation = iScanner.next().charAt(0);
        double sum = 0;
        double mult = 0;
        double diff = 0;
        double quotient = 0;
        if (operation == '+') {
            sum = a + b;
            System.out.println(sum);
        } else if (operation == '-') {
            diff = a - b;
            System.out.println(diff);
        } else if (operation == '*') {
            mult = a * b;
            System.out.println(mult);
        } else if (operation == '/') {
            quotient = a / b;
            System.out.println(quotient);
        }
        iScanner.close();
    }
}
