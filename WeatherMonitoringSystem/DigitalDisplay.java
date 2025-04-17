public class DigitalDisplay implements Observer {
    @Override
    public void update(float temperature, float humidity) {
        System.out.println("Digital Display - Temp: " + temperature + "°C, Humidity: " + humidity + "%");
    }
}
