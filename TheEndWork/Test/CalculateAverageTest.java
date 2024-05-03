import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculateAverageTest {

    @Test
    void testGetAverageInArr() {
        CalculateAverage calculateAverage = new CalculateAverage();
        assertEquals( 3, calculateAverage.getAverageInArr(new int[]{1, 2, 3, 6}));
        assertEquals( 2, calculateAverage.getAverageInArr(new int[]{3, 2, 1, 2}));
    }

}