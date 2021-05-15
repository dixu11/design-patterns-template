package behavioral.observator;

import java.util.HashSet;

import java.util.Random;
import java.util.Set;

class WeatherStation {

    private Set<WeatherClient> clients = new HashSet<>();

    private double temperatureCelsius;
    private double precipitation; // opady
    private double pressure;
    private double wind;


    public void measure(){
        Random random = new Random();
        temperatureCelsius = random.nextInt(51) -10;  //-10 -> 40
        precipitation = random.nextDouble()*10;
        pressure = 1000+  random.nextDouble()*10 -5;
        wind = random.nextDouble();
        for (WeatherClient client : clients) {
            client.newWeather(this);
        }
    }

    public void registerNewClient(WeatherClient client) {
        clients.add(client);
    }

    public void unsubscribeClient(WeatherClient client) {
        clients.remove(client);
    }

    @Override
    public String toString() {
        return "WeatherStation{" +
                "temperatureCelsius=" + temperatureCelsius +
                ", precipitation=" + precipitation +
                ", pressure=" + pressure +
                '}';
    }

    double getTemperatureCelsius() {
        return temperatureCelsius;
    }

    double getPrecipitation() {
        return precipitation;
    }

    double getPressure() {
        return pressure;
    }

    double getWind() {
        return wind;
    }
}
