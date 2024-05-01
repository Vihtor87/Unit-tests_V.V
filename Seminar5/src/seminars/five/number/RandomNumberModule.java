package seminars.five.number;

import java.util.Random;

public class RandomNumberModule {
    public int[] generateRandomNumbers(int arrSize) {
        Random random = new Random();
        int[] numbers = new int[arrSize];
        for (int i = 0; i < arrSize; i++) {
            numbers[i] = random.nextInt(100);
        }
        return numbers;
    }
}
