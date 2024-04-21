package seminars.third.tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class TestDrivenDevelopment {

    private MoodAnalyser moodAnalyser;

    @BeforeEach
    void setup() {
        moodAnalyser = new MoodAnalyser();
    }

    //3.5. Red-Green-Refactor
    @Test
    void moodSadAnalysis() {
        String mood = moodAnalyser.analyseMood("Это грустное сообщение");
        assertThat(mood).isEqualTo("SAD");
    }
    @Test
    void moodHappySadAnalysis() {
        String mood = moodAnalyser.analyseMood("Это хорошее сообщение");
        assertThat(mood).isEqualTo("HAPPY");
    }
}