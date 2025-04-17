public class NewsChannel implements Observer {
    @Override
    public void update(float temperature, float humidity) {
        System.out.println("NewsChannel Breaking: Temp is " + temperature + "°C and Humidity is " + humidity + "%");
    }
}
