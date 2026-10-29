public class Calculator {

    private double lastResult = 0; // US5

// ---- US2 ----
public double add(double a, double b) {
    lastResult = a + b;
    return lastResult;
}

public double subtract(double a, double b) {
    lastResult = a - b;
    return lastResult;
}

// ---- US3 + US4 ----
public double multiply(double a, double b) {
    lastResult = a * b;
    return lastResult;
}

public double divide(double a, double b) {
    if (b == 0) {
        throw new ArithmeticException("Division by zero is not allowed");
    }
    lastResult = a / b;
    return lastResult;
} 
public double getLastResult() { return lastResult; }
    // ---- US6 (FUTURE) ----
    public void clear() { }                                  // TODO US6

    // ---- US9 (FUTURE) ----
    public double power(double base, double exponent) { return 0; } // TODO US9
    public double squareRoot(double a)                { return 0; } // TODO US9

    // ---- US10 (FUTURE) ----
    public double sin(double degrees) { return 0; }          // TODO US10
    public double cos(double degrees) { return 0; }          // TODO US10
    public double tan(double degrees) { return 0; }          // TODO US10

    // ---- US11 (FUTURE) ----
    public double log(double a) { return 0; }                // TODO US11
}