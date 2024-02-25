package Generics.Question5;

interface Calculator<T> {
    T add(T operand1, T operand2);
    T subtract(T operand1, T operand2);
    T multiply(T operand1, T operand2);
    T divide(T operand1, T operand2);
}

class IntergerCalculator implements Calculator<Integer> {
    @Override
    public Integer add(Integer operand1, Integer operand2) {
        return operand1 + operand2;
    }

    @Override
    public Integer subtract(Integer operand1, Integer operand2) {
        return operand1 - operand2;
    }

    @Override
    public Integer multiply(Integer operand1, Integer operand2) {
        return operand1 * operand2;
    }

    @Override
    public Integer divide(Integer operand1, Integer operand2) {
        return operand1 / operand2;
    }
}

class DoubleCalculator implements Calculator<Double> {
    @Override
    public Double add(Double operand1, Double operand2) {
        return operand1 + operand2;
    }

    @Override
    public Double subtract(Double operand1, Double operand2) {
        return operand1 - operand2;
    }

    @Override
    public Double multiply(Double operand1, Double operand2) {
        return operand1 * operand2;
    }

    @Override
    public Double divide(Double operand1, Double operand2) {
        return operand1 / operand2;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator<Integer> intCalculator = new IntergerCalculator();
        System.out.println(intCalculator.add(3, 4));

        Calculator<Double> doubleCalculator = new DoubleCalculator();
        System.out.println(doubleCalculator.multiply(2.5, 3.0));
    }
}
