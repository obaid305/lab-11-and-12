public class MobileAlertSystem implements Observer {
    @Override
    public void update(float temperature, float humidity) {
        System.out.println("Mobile Alert - Weather changed! Temp: " + temperature + ", Humidity: " + humidity);
    }
}
