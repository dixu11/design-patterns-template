package structural.decoratorExample;

class DecoratorDemo {
    public static void main(String[] args) {

        Window window = new ClassicWindow();
        window.display();
        System.out.println("-------");

        Window windowWithSlider = new VerticalSliderDecorator(new ClassicWindow());
        windowWithSlider.display();
        System.out.println("-------");

        Window windowWithBothSliders =
                new VerticalSliderDecorator(new HorizontalSliderDecorator(new ClassicWindow()));
        windowWithBothSliders.display();
        System.out.println("-------");

        Window windowWithBorder = new BorderDecorator( new ClassicWindow() , "Black"    );
        windowWithBorder.display();

        System.out.println("-------");
        Window twoFramesWindow = new BorderDecorator( new BorderDecorator(
                new ClassicWindow()  ,"pink") , "Black" );
        twoFramesWindow.display();

        System.out.println("------");
        Window aditionalSlider = new VerticalSliderDecorator(twoFramesWindow);
        aditionalSlider.display();

        System.out.println("------");
        //wstawiam do zmiennej BorderDecorator żeby była widoczna metoda set
        BorderDecorator borderWindow = new BorderDecorator( new ClassicWindow() , "Black");
        borderWindow.display();
        borderWindow.setColor("green");
        borderWindow.display();





    }
}
