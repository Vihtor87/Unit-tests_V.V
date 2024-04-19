package seminars.first.Calculator;

import java.util.Scanner;

public class Calculator {

    // Нужно написать в калькуляторе метод вычисления суммы покупки со скидкой и проверить его, используя AssertJ
    // Примерная сигнатура и тело метода:
//    public static double calculatingDiscount(double purchaseAmount, int discountAmount) {
        // purchaseAmount - сумма покупки
        // discountAmount - размер скидки в %
        // Метод должен возвращать сумму покупки со скидкой
//        if (discountAmount < 0) {
//            throw new ArithmeticException("Скидка не может быть отрицательной!");
//        } else if (discountAmount >= 100) {
//            throw new ArithmeticException("Скидка 100%! Магазин себе такого позволить не может! :)");
//        }
//        return purchaseAmount - (purchaseAmount * discountAmount / 100);
//    }
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int firstOperant = getOperant();
        int secondOperant = getOperant();
        char operator = getOperator();
        int res = calculation(firstOperant, secondOperant, operator);
        System.out.printf(String.format("Результат выполения операции %s чисел %s и %s равен %s", operator, firstOperant, secondOperant, res));
    }

    public static char getOperator() {
        System.out.print("Ведите операцию вычисления: ");
        char operation = scanner.next().charAt(0);
        return operation;
    }

    public static int getOperant() {
        System.out.print("Ведите число: ");
        int operant;
        if (scanner.hasNextInt()) {
            operant = scanner.nextInt();
        } else {
            System.out.print("Введено не число, попробуйте ёще раз!");
            if (scanner.hasNextInt()) {
                operant = scanner.nextInt();
            } else {
                throw new IllegalStateException("Ошибка ввода данных!");
            }
        }
        return operant;
    }


    public static int calculation(int firstOperand, int secondOperand, char operator) {
        int result;

        switch (operator) {
            case '+':
                result = firstOperand + secondOperand;
                break;
            case '-':
                result = firstOperand - secondOperand;
                break;
            case '*':
                result = firstOperand * secondOperand;
                break;
            case '/':
                if (secondOperand != 0) {
                    result = firstOperand / secondOperand;
                    break;
                } else {
                    throw new ArithmeticException("Division by zero is not possible");
                }
            case '^':
                result = (int) Math.pow(firstOperand, secondOperand);
                break;
            default:
                throw new IllegalStateException("Unexpected value operator: " + operator);
        }
        return result;
    }

    // HW1.1: Придумайте и опишите (можно в псевдокоде) функцию извлечения корня и
    // необходимые проверки для него используя граничные случаи
    public static double squareRootExtraction(double num) {
        //  0
        //  Отрицательные числа
        //  Дробные значения корней
        //  Целые
            if(num < 0) {
                throw new IllegalArgumentException("Cannot calculate square root of a negative number");
            }
            return Math.sqrt(num);
    }
}