package structural.decoratorExample;

class BorderDecorator extends WindowDecorator{

    private String color;

    BorderDecorator(Window window, String color) {
        super(window);
        this.color = color;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Okno posiada ramkę o kolorze :  " + color);
    }

    void setColor(String color) {
        this.color = color;
    }
}
