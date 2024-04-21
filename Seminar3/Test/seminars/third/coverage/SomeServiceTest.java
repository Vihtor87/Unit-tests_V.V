package seminars.third.coverage;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.security.Signature;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class SomeServiceTest {

    private SomeService someService;
    @BeforeEach
    void setup() {
        someService = new SomeService();
    }
   // 3.1.
    @ParameterizedTest
    @ValueSource(ints = {3, 6, 9, 33})
    void multipleThreeNotFiveReturnsFizz(int n) {
        assertEquals("Fizz", someService.fizzBuzz(n));
    }
    @ParameterizedTest
    @ValueSource(ints = {5, 10, 25, 35})
    void multipleFiveNotThreeReturnsFizz(int n) {
        assertEquals("Buzz", someService.fizzBuzz(n));
    }
    @ParameterizedTest
    @ValueSource(ints = {15, 30, 45})
    void multipleThreeAndFiveReturnsFizz(int n) {
        assertEquals("FizzBuzz", someService.fizzBuzz(n));
    }
    @ParameterizedTest
    @ValueSource(ints = {1, 2, 43})
    void notMultipleOfThreeOfFiveReturnsFizz(int n) {
        assertEquals(Integer.toString(n), someService.fizzBuzz(n));
    }

    //3.2
    @Test
        void arrGetFirstNumSix() {
        assertTrue(someService.firstLast6(new int[] {6, 5, 2, 9}));
    }
    @Test
    void arrGetEndNumSix() {
        assertTrue(someService.firstLast6(new int[] {3, 5, 6}));
    }
    @Test
    void arrNotGetFirstEndEndNumSix() {
        assertFalse(someService.firstLast6(new int[] {3, 5, 2, 10}));
    }

    //3.3
    @Test
    void checkCorrectPriseAndDiscount() {
        assertEquals(100, someService.calculatingDiscount(100, 0));
        assertEquals(50, someService.calculatingDiscount(100, 50));
        assertEquals(0, someService.calculatingDiscount(100, 100));
    }
    @Test
    void checkDiscountBigger100() {
        assertThatThrownBy(() -> someService.calculatingDiscount(100, 110))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Скидка должна быть в диапазоне от 0 до 100%");
    }
    @Test
    void checkDiscountSmallerZero() {
        assertThatThrownBy(() -> someService.calculatingDiscount(100, -10))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Скидка должна быть в диапазоне от 0 до 100%");
    }
    @Test
    void checkPurchaseSmallerZero() {
        assertThatThrownBy(() -> someService.calculatingDiscount(-100, 10))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Сумма покупки не может быть отрицательной");
    }

    //3.4
    @Test
    void checkSumWithOut13() {
        assertEquals(12, someService.getSumThreeValue(3, 3, 6));
    }
    @Test
    void checkSumWith13() {
        assertEquals(12, someService.getSumThreeValue(13, 6, 6));
        assertEquals(10, someService.getSumThreeValue(7, 13, 3));
        assertEquals(18, someService.getSumThreeValue(12, 6, 13));
        assertEquals(0, someService.getSumThreeValue(13, 13, 13));
    }
}
