package behavioral.strategy;

class France implements TaxCalculator{
    @Override
    public double applyTax(double price) {
        return price * 1.24;
    }
}
