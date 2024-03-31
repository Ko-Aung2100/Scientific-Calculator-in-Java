public class Test {
    public static void main(String[] args) {
        CalculatorInterface calculator = new BasicFunction();
        double[] numbers = {1, 2, 3, 4}; // Example array with a zero element
        try {
            double result = calculator.division(numbers);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
            // Handle the error gracefully
        }

        double mulResult = calculator.multiplication(numbers);
        System.out.println("Multiplication Result is : " + mulResult);

        double addResult = calculator.addition(numbers);
        System.out.println("Addition Result is : " + addResult);

    }
}
