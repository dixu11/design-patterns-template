package structural.adapter.eu_cars;

import structural.adapter.american_module.CarUS;

public class UsToEuAdapter implements CarEU{


    private CarUS carUS;


    public UsToEuAdapter(CarUS carUS) {
        this.carUS = carUS;
    }

    @Override
    public double getMileageInKm() {
        return carUS.getMileageInMiles() * 1.6;
    }

    @Override
    public String getName() {
        return carUS.getName();
    }
}
