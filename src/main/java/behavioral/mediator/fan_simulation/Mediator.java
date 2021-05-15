package behavioral.mediator.fan_simulation;

class Mediator {

    private Fan fan;
    private PowerSupplier supplier;

    void setFan(Fan fan) {
        this.fan = fan;
    }

    void setSupplier(PowerSupplier supplier) {
        this.supplier = supplier;
    }

    boolean isFanOn() {
        return fan.isOn();
    }

    void turnFanOff() {
        fan.turnOff();
    }

    void turnFanOn() {
        fan.turnOn();
    }

    void startSupplier() {
        supplier.start();
    }

    void stopSupplier() {
        supplier.stop();
    }
}
