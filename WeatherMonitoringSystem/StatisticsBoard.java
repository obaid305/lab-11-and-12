public class StatisticsBoard implements Observer {
    @Override
    public void update(float temperature, float humidity) {
        System.out.println("Statistics Board - Avg Temp: " + temperature + "°C, Avg Humidity: " + humidity + "%");
    }
}
