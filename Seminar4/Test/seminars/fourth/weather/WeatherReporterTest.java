package seminars.fourth.weather;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;


class WeatherReporterTest {

    @Test
    public void testWeatherReporter() {
        WeatherService mockWeatherService = mock(WeatherService.class);
        when(mockWeatherService.getCurrentTemperature()).thenReturn(22);

        WeatherReporter mockWeatherReporter = new WeatherReporter(mockWeatherService);

        String report = mockWeatherReporter.generateReport();

        assertEquals("Текущая температура: 22 t.", report);
    }
}