package behavioral.observator;

import java.util.Random;

class WeatherStation {

    private WeatherAnnouncer weatherAnnouncer = new WeatherAnnouncer();
    private double temperatureCelsius;
    private double precipitation; // opady
    //todo pressure


    public void measure(){
        Random random = new Random();
        temperatureCelsius = random.nextInt(51) -10;  //-10 -> 40
        precipitation = random.nextDouble()*10;
        weatherAnnouncer.showWeather(temperatureCelsius,precipitation);
    }

    @Override
    public String toString() {
        return "WeatherStation{" +
                "temperatureCelsius=" + temperatureCelsius +
                ", precipitation=" + precipitation +
                '}';
    }


}
