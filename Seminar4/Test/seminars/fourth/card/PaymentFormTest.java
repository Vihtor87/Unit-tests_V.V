package seminars.fourth.card;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

class PaymentFormTest {

    /**
     * 4.2. Используя библиотеку Mockito, напишите модульные тесты для проверки функциональности формы оплаты на сайте.
     * * Вместо реальной кредитной карты используйте мок-объект.
     * Создайте класс `CreditCard` с методами `getCardNumber()`, `getCardHolder()`, `getExpiryDate()`,
     * `getCvv()`, `charge(double amount)`.
     * Создайте класс `PaymentForm` с методом `pay(double amount)`.
     * В тестовом классе, создайте мок-объект для класса `CreditCard`.
     * Определите поведение мок-объекта с помощью метода `when()`.
     * Создайте объект класса `PaymentForm`, передайте ему мок-объект в качестве аргумента.
     * Вызовите метод `pay()` и убедитесь, что мок-объект вызывает метод `charge()`
     */
    @Test
    void someName() {
        CreditCard mockCreditCard = mock(CreditCard.class);
        when(mockCreditCard.getCardNumber()).thenReturn("1234098756786543");
        when(mockCreditCard.getCardHolder()).thenReturn("Card Holder");
        when(mockCreditCard.getExpiryDate()).thenReturn("01/23");
        when(mockCreditCard.getCvv()).thenReturn("135");

        PaymentForm paymentForm = new PaymentForm(mockCreditCard);

        paymentForm.pay(100);

        verify(mockCreditCard, times(1)).charge(100);
    }
}