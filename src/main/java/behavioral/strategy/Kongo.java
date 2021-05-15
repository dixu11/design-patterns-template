package behavioral.strategy;

class Kongo implements TaxCalculator{
    @Override
    public double applyTax(double price) {
        return price * 1.11;
    }
}
