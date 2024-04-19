import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import seminars.first.Calculator.Calculator;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.*;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setup() {
        calculator = new Calculator();
    }

    @Test
    void evaluatesExpression() {
//        Calculator calculator = new Calculator();
        assertThat(calculator.calculation(2, 6, '+')).isEqualTo(8);
    }

    @Test
    void subtractionExpression() {
//        Calculator calculator = new Calculator();
        assertThat(calculator.calculation(2, 1, '-')).isEqualTo(1);
    }

    @Test
    void multiplicationExpression() {
//        Calculator calculator = new Calculator();
        assertThat(calculator.calculation(2, 2, '*')).isEqualTo(4);
    }

    @Test
    void divisionExpression() {
//        Calculator calculator = new Calculator();
        assertThat(calculator.calculation(8, 2, '/')).isEqualTo(4);
    }

    @Test
    void powExpression() {
//        Calculator calculator = new Calculator();
        assertThat(calculator.calculation(2, 3, '^')).isEqualTo(8);
    }

    @Test
    void powExpressionAtZero() {
//        Calculator calculator = new Calculator();
        assertThat(calculator.calculation(2, 0, '^')).isEqualTo(1);
    }

    @Test
    void powExpressionAtMinusOne() {
//        Calculator calculator = new Calculator();
        assertThat(calculator.calculation(2, -1, '^')).isEqualTo(0);
    }

    @Test
    void expectedIllegalExceptionOnInvalidOperatorSymbol() {
//        Calculator calculator = new Calculator();
        assertThatThrownBy(() -> calculator.calculation(8, 2, '_'))
                .isInstanceOf(IllegalStateException.class);
    }

    @Test
    @Disabled
    void getOperantCompletesCorrectlyWhitNumber() {
        String testedValue = "9";
        ByteArrayInputStream in = new ByteArrayInputStream(testedValue.getBytes());
        InputStream inputStream = System.in;
        System.setIn(in);

        Calculator.getOperant();

        System.out.println(testedValue);
        System.setIn(inputStream);
    }

    @Test
    @Disabled
    void getOperantCompletesCorrectlyWhitNotNumber() {
        String testedValue = "w";
        ByteArrayInputStream in = new ByteArrayInputStream(testedValue.getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        InputStream inputStream = System.in;
        System.setIn(in);
        System.setOut(new PrintStream(out));

        assertThatThrownBy(() -> Calculator.getOperant()).isInstanceOf(IllegalStateException.class)
                        .describedAs("Ошибка ввода данных!");

        System.setIn(inputStream);
        System.setOut(null);
    }
}
//    public static void main(String[] args) {

// Домашка, семинар 1:
// Проверка базового функционала, с использованием утверждений AssertJ:

//        assertThat(Calculator.calculatingDiscount(200.0, 10)).isEqualTo(180);
//        assertThat(Calculator.calculatingDiscount(150.0, 0)).isEqualTo(150);
//        assertThat(Calculator.calculatingDiscount(150.0, -10)).isInstanceOf(IllegalStateException.class);
//        assertThat(Calculator.calculatingDiscount(190.0, 100)).isInstanceOf(IllegalStateException.class);



// Проверка базового функционала с целыми числами:
//        if (8 != Calculator.calculation(2, 6, '+')) {
//            throw new AssertionError("Ошибка в методе");
//        }
//
//        if (0 != Calculator.calculation(2, 2, '-')) {
//            throw new AssertionError("Ошибка в методе");
//        }
//
//        if (14 != Calculator.calculation(2, 7, '*')) {
//            throw new AssertionError("Ошибка в методе");
//        }
//
//        if (2 != Calculator.calculation(100, 50, '/')) {
//            throw new AssertionError("Ошибка в методе");
//        }

// Случаи с неправильными аргументами
// аргумент operator типа char, должен вызывать исключение, если он получает не базовые символы (+-*/)
// try {
//     seminars.first.Calculator.Calculator.calculation(8, 4, '_');
// } catch (IllegalStateException e) {
//     if (!e.getMessage().equals("Unexpected value operator: _")) {
//         throw new AssertionError("Ошибка в методе");
//     }
// }

// Проверка базового функционала с целыми числами, с использованием утверждений:
//        assert 8 == Calculator.calculation(2, 6, '+');
//        assert 0 == Calculator.calculation(2, 2, '-');
//        assert 14 == Calculator.calculation(2, 7, '*');
//        assert 2 == Calculator.calculation(100, 50, '/');

// Проверка базового функционала с целыми числами, с использованием утверждений AssertJ:
//        assertThat(Calculator.calculation(2, 6, '+')).isEqualTo(8);
//        assertThat(Calculator.calculation(2, 2, '-')).isEqualTo(0);
//        assertThat(Calculator.calculation(2, 7, '*')).isEqualTo(14);
//        assertThat(Calculator.calculation(100, 50, '/')).isEqualTo(2);

// Проверка ожидаемого исключения, с использованием утверждений AssertJ:
//        assertThatThrownBy(() ->
//                Calculator.calculation(8, 4, '_')
//        ).isInstanceOf(IllegalStateException.class);

//        System.out.println(Calculator.calculation(2_147_483_647, 1, '+')); // integer overflow
//        System.out.println(Calculator.squareRootExtraction(169));

// Примерные решения домашних заданий из 1 лекции:

// HW1.1: Придумайте и опишите (можно в псевдокоде) функцию извлечения корня и
// необходимые проверки для него используя граничные случаи
// assertThatThrownBy(() ->
//         seminars.first.Calculator.Calculator.squareRootExtraction(0, 1, -1)
// ).isInstanceOf(SomeStateException.class);

// HW1.2: Как будет выглядеть проверка для случая деления на ноль? (с использованием AssertJ)
// assertThatThrownBy(() ->
//        seminars.first.Calculator.Calculator.calculation(5, 0, '/')
// ).isInstanceOf(ArithmeticException.class);

// HW1.3: Сравните одну и ту же проверку с использованием условий, ассертов, AssertJ
// в каком случае стандартное сообщение об ошибке будет более информативным?
// if (0 != seminars.first.Calculator.Calculator.calculation(2, 6, '+')) {
//     throw new AssertionError("Ошибка в методе");
// }
//   assert 0 == seminars.first.Calculator.Calculator.calculation(2, 6, '+');
//    assertThat(seminars.first.Calculator.Calculator.calculation(2, 6, '+')).isEqualTo(0);

//    }