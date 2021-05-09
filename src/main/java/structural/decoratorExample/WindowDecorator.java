package structural.decoratorExample;
//wrapper
class WindowDecorator implements Window {

    private Window window;

    WindowDecorator(Window window) {
        this.window = window;
    }

    @Override
    public void display() {
        window.display();
    }
}
