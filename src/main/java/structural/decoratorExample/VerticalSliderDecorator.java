package structural.decoratorExample;

class VerticalSliderDecorator extends WindowDecorator{
    VerticalSliderDecorator(Window window) {
        super(window);
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Okno posiada pionowy slider");
    }
}
