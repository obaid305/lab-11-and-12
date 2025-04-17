public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        // Create observers
        DigitalDisplay digitalDisplay = new DigitalDisplay();
        StatisticsBoard statisticsBoard = new StatisticsBoard();
        MobileAlertSystem mobileAlertSystem = new MobileAlertSystem();

        // Register observers
        weatherStation.registerObserver(digitalDisplay);
        weatherStation.registerObserver(statisticsBoard);
        weatherStation.registerObserver(mobileAlertSystem);

        // Simulate weather change
        weatherStation.setWeatherData(30.5f, 70.0f);

        // Dynamically add NewsChannel
        NewsChannel newsChannel = new NewsChannel();
        weatherStation.registerObserver(newsChannel);

        System.out.println("\nAfter adding NewsChannel:\n");
        weatherStation.setWeatherData(32.0f, 65.5f);
    }
}
