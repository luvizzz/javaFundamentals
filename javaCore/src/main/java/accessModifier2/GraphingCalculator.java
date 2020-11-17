package accessModifier2;

import accessModifier.Calculator;

public class GraphingCalculator extends Calculator {
    public GraphingCalculator(String result, String operand, String input1, String input2) {
        super(result, operand, input1, input2);
    }

    public String toString() {
        return String.format("This graphing calculator has: %n" +
                        "- public result: %s%n" +
                        "- protected operand: %s%n" +
                        "- (no modifier) input1: not accessible%n" +
                        "- private input2: not accessible%n",
                result,
                operand);
    }

    public String getAvailableAttributes() {
        return String.format("Only accessible values from [Subclass] are: '%s', '%s'",
                this.operand,
                this.result);
    }
}
