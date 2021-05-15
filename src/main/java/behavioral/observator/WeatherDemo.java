package behavioral.observator;

class WeatherDemo {
    public static void main(String[] args) {
        WeatherForecaster forecaster = new WeatherForecaster();
        WeatherAnnouncer announcer = new WeatherAnnouncer();
        WeatherFireAlarm alarm = new WeatherFireAlarm();
        WeatherStation station = new WeatherStation();
        station.registerNewClient(forecaster);
        station.registerNewClient(announcer);
        station.registerNewClient(alarm);
        //metoda uruchamiana co godzinę automatycznie
        station.measure();
        station.measure();
        station.measure();
        station.unsubscribeClient(alarm);
        station.measure();
        station.measure();




    }
}
