package behavioral.observator;

class WeatherFireAlarm implements WeatherClient{
    @Override
    public void newWeather(WeatherStation station) {
        if (station.getTemperatureCelsius() > 35 &&
                station.getPrecipitation() < 2.5) {
            System.out.println("ZAGROZENIE POZAROWE!");
        } else {
            System.out.println("brak zagrozenia");
        }
    }
}
