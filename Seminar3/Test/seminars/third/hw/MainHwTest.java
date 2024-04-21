package seminars.third.hw;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MainHwTest {
    //3.1
    @Test
    void checkValueIsEven() {
        assertTrue(MainHW.evenOddNumber(2));
        assertTrue(MainHW.evenOddNumber(0));
        assertTrue(MainHW.evenOddNumber(12));
    }
    @Test
    void checkValueIsOdd() {
        assertFalse(MainHW.evenOddNumber(3));
        assertFalse(MainHW.evenOddNumber(1));
        assertFalse(MainHW.evenOddNumber(13));
    }

    //3.2
    @Test
    void checkNumInInterval() {
        assertTrue(MainHW.numberInInterval(25));
        assertTrue(MainHW.numberInInterval(26));
        assertTrue(MainHW.numberInInterval(50));
        assertTrue(MainHW.numberInInterval(99));
        assertTrue(MainHW.numberInInterval(100));
    }
    @Test
    void checkNumOutInterval() {
        assertFalse(MainHW.numberInInterval(12));
        assertFalse(MainHW.numberInInterval(24));
        assertFalse(MainHW.numberInInterval(101));
        assertFalse(MainHW.numberInInterval(150));
    }
}
