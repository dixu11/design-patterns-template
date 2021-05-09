package structural.decoratorExample;

class HorizontalSliderDecorator extends WindowDecorator{
    HorizontalSliderDecorator(Window window) {
        super(window);
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Okno posiada poziomy slider");
    }
}
