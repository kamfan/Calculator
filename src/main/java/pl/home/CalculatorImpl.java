package pl.home;

public class CalculatorImpl implements Calculator {

    @Override
    public int addition(int a, int b) {
        return a + b;
    }

    @Override
    public int substraction(int a, int b) {
        return a - b;
    }
}
