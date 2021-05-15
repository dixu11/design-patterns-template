package behavioral.mediator.fan_simulation;

public class Button {

    private Mediator mediator;

    Button(Mediator mediator) {
        this.mediator = mediator;
    }

    public void push() {
        if (mediator.isFanOn()) {
            mediator.turnFanOff();
        } else {
            mediator.turnFanOn();
        }
    }


}
