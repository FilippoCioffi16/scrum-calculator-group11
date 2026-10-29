public class CalculatorTest {
    private static int failures = 0;

    private static void check(String name, double actual, double expected) {
        if (Math.abs(actual - expected) < 1e-9) {
            System.out.println("OK    " + name);
        } else {
            System.out.println("FAIL  " + name + " (expected " + expected + ", got " + actual + ")");
            failures++;
        }
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // US2 interi, decimali, negativi
        check("5 + 3", calc.add(5, 3), 8);
        check("0.1 + 0.2", calc.add(0.1, 0.2), 0.3);
        check("-4 + 10", calc.add(-4, 10), 6);
        check("10 - 4", calc.subtract(10, 4), 6);
        check("2.5 - 0.5", calc.subtract(2.5, 0.5), 2.0);
        check("3 - 8", calc.subtract(3, 8), -5);

        // US3 decimali e negativi
        check("6 * 7", calc.multiply(6, 7), 42);
        check("2.5 * 4", calc.multiply(2.5, 4), 10);
        check("-3 * 5", calc.multiply(-3, 5), -15);
        check("-3 * -5", calc.multiply(-3, -5), 15);
        check("10 / 4", calc.divide(10, 4), 2.5);
        check("-9 / 3", calc.divide(-9, 3), -3);

        // divisione per zero, il risultato precedente deve restare valido
        double before = calc.getLastResult();
        try {
            calc.divide(10, 0);
            System.out.println("FAIL  10 / 0 should throw");
            failures++;
        } catch (ArithmeticException e) {
            System.out.println("OK    10 / 0 throws ArithmeticException");
        }
                check("lastResult unchanged after error", calc.getLastResult(), before);

        // US5 ultimo risultato
        calc.add(5, 3);
        check("lastResult after add", calc.getLastResult(), 8);
        calc.multiply(calc.getLastResult(), 2);
        check("lastResult chained", calc.getLastResult(), 16);

        System.out.println(failures == 0 ? "All tests passed" : failures + " test(s) failed");
    }
}