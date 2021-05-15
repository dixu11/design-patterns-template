package behavioral.observator;

import java.util.Random;

class WeatherForecaster  implements WeatherClient{

    @Override
    public void newWeather(WeatherStation station) {
            showForecast(station.getTemperatureCelsius(), station.getPrecipitation());
    }

    public void showForecast(double tempCelsius, double precipitation) {
        Random random = new Random();
        double expectedTemp = tempCelsius + random.nextInt(3);
        double expectedPrecipitation = precipitation - random.nextDouble();
        System.out.println("Przewidywana temperatura: " + expectedTemp);
        System.out.println("PRzewidywana wilgotność: " + expectedPrecipitation);
        System.out.println();
    }


}
