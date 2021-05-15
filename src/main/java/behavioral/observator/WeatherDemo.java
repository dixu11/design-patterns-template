package behavioral.observator;

class WeatherDemo {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();
        //metoda uruchamiana co godzinę automatycznie
        station.measure();
        station.measure();
        station.measure();
        station.measure();
        station.measure();




    }
}
