package accessModifier;

public class Calculator {

    public String result;
    protected String operand;
    String input1;
    private String input2;

    public Calculator(String result, String operand, String input1, String input2) {
        this.result = result;
        this.operand = operand;
        this.input1 = input1;
        this.input2 = input2;
    }

    public String toString() {
        return String.format("This calculator has: %n" +
                        "- public result: %s%n" +
                        "- protected operand: %s%n" +
                        "- (no modifier) input1: %s%n" +
                        "- private input2: %s%n",
                result,
                operand,
                input1,
                input2);
    }
}
