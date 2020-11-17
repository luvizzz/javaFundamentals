package ocp.counterExample;

import ocp.Painter;

//Open closed principle
public class BadRobotV2_3 implements Painter {

    String name = this.getClass().getSimpleName();

    public String paint() {
        return String.format("I am a %s, now I can cut!", name);
    }
}
