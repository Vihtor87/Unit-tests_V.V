package seminars.fourth.weather;

public class WeatherReporter {
    private WeatherService weatherService;

    // Внедрение зависимости через конструктор
    public WeatherReporter(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    public String generateReport() {
        int temperature = weatherService.getCurrentTemperature();
        return "Текущая температура: " + temperature + " t.";
    }
}
