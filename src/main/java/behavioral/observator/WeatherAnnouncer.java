package behavioral.observator;

//klasa odpowiada za wyświetanie aktualnej pogody
class WeatherAnnouncer implements WeatherClient{

    @Override
    public void newWeather(WeatherStation station) {
        showWeather(station.getTemperatureCelsius(),
                station.getPrecipitation(),station.getPressure(), station.getWind());
    }


    public void showWeather(double tempCelsius, double precipitation,double pressure, double wind) {
        System.out.println("Aktualna temperatura to: " + tempCelsius + " stopni");
        System.out.println("Opady : " + precipitation + "mm/m2");
        String type = matchPrecipitationType(precipitation);
        System.out.println("Rodzaj opadu: " +  type + " opad");
        System.out.println("Ciśnienie: " + pressure + " hPa");
        System.out.println("Wiatr: " + wind);
        System.out.println();

    }

    private String matchPrecipitationType( double precipitation) {
        String type;
        if (precipitation <= 2.5) {
            type = "lekki";
        } else if (precipitation < 7.5) {
            type = "umiarkowany";
        } else {
            type = "silny";
        }
        return type;
    }
    /*
     * "Intensywność deszczu klasyfikuje się jako: „lekki opad”, gdy spada nie więcej
     * niż 2,5 mm wody na godzinę, „umiarkowany opad” – pomiędzy 2,5 a 7,5 mm wody na
     *  godzinę, „silny opad”
     * – powyżej 7,5 mm wody na godzinę. 1 mm opadu to 1 litr wody na metr kwadratowy"
     * */

    //WeatherStation przy zmianie pogody może wywołać
    // showWeather z announcera

    //WeatherAnnouncer sprawdza co jakiś czas, czy
    // pomiary się zmieniły i jeśli tak to wyświetli
    // komunikat

}
