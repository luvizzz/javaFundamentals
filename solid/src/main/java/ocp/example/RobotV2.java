package ocp.example;

import ocp.Cutter;
import ocp.Painter;

//Open closed principle
public class RobotV2 implements Cutter, Painter {

    String name = this.getClass().getSimpleName();

    public String cut() {
        return String.format("I am a %s, now I can cut!", name);
    }

    public String paint() {
        return String.format("I am a %s, now I can paint!", name);
    }
}
