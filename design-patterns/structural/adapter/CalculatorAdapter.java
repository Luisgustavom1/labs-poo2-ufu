public class CalculatorAdapter extends Calculator {
    public BinaryCalculator binaryCalculator = new BinaryCalculator();

    public CalculatorAdapter() {}

    public int add(int a, int b) {
        // Converts
        String aAdapted = Integer.toString(a);
        String bAdapted = Integer.toString(b);

        return Integer.valueOf(this.binaryCalculator.add(aAdapted, bAdapted));
    }
}