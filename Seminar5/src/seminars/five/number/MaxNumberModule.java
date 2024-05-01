package seminars.five.number;

import java.util.List;

public class MaxNumberModule {
    public int findMaxNumber(int[] randomArr) {
        int maxNumber = randomArr[0];
        for (int i = 1; i < randomArr.length; i++) {
            if (randomArr[i] > maxNumber) {
                maxNumber = randomArr[i];
            }
        }
        return maxNumber;
    }
}
