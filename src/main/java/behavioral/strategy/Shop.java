package behavioral.strategy;

class Shop {

    private static final double PRICE = 9.99;

    private TaxCalculator calculator = new France();

    public double howMuchToPay(int amount){
        double price = amount * PRICE;
        return calculateTax(price);
    }

    public double calculateTax(double price){
        return calculator.applyTax(price);
    }

    void setCalculator(TaxCalculator calculator) {
        this.calculator = calculator;
    }

    public static void main(String[] args) {
        Shop shop = new Shop();
        System.out.println("FRANCJA");
        System.out.println("Do zapłacenia: " + shop.howMuchToPay(3) + " zł");
        System.out.println("Za 3 produkty");
        System.out.println("Uwzględniono podatek!");

        shop.setCalculator(new Kongo());
        System.out.println("KONGO");
        System.out.println("Do zapłacenia: " + shop.howMuchToPay(3) + " zł");
        System.out.println("Za 3 produkty");
        System.out.println("Uwzględniono podatek!");
    }

}
