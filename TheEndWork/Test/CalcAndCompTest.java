import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalcAndCompTest {

    @Test
    void checkCalcAndComp() {
        CalculateAverage calculateAverage = new CalculateAverage();
        ValuesComparison valuesComparison = new ValuesComparison();

        double val1 = calculateAverage.getAverageInArr(new int[] {1, 2, 3, 4});
        double val2 = calculateAverage.getAverageInArr(new int[] {20, 5, 1, 3});
        double val3 = calculateAverage.getAverageInArr(new int[] {1, 2, 3, 4});

        String res1 = valuesComparison.getComparisonValue(val2, val1);
        String res2 = valuesComparison.getComparisonValue(val1, val2);
        String res3 = valuesComparison.getComparisonValue(val1, val3);


        assertEquals("Первый список имеет большее среднее значение.", res1);
        assertEquals("Второй список имеет большее среднее значение.", res2);
        assertEquals("Средние значения равны.", res3);
    }
}
