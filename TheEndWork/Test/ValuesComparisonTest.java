import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ValuesComparisonTest {

    @Test
    void checkValuesComparison() {
        ValuesComparison valuesComparison = new ValuesComparison();

        String res1 = valuesComparison.getComparisonValue(15, 10);
        String res2 = valuesComparison.getComparisonValue(2, 8);
        String res3 = valuesComparison.getComparisonValue(5, 5);

        assertEquals("Первый список имеет большее среднее значение.", res1);
        assertEquals("Второй список имеет большее среднее значение.", res2);
        assertEquals("Средние значения равны.", res3);
    }
}