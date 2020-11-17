package accessModifier;

public class ScientificCalculator extends Calculator {
    public ScientificCalculator(String result, String operand, String input1, String input2) {
        super(result, operand, input1, input2);
    }

    public String toString() {
        return String.format("This scientific calculator has: %n" +
                        "- public result: %s%n" +
                        "- protected operand: %s%n" +
                        "- (no modifier) input1: %s%n" +
                        "- private input2: not accessible%n",
                result,
                operand,
                input1);
    }

    public String getAvailableAttributes() {
        return String.format("Only accessible values from [Package] are: '%s', '%s', '%s'",
                this.input1,
                this.operand,
                this.result);
    }
}
