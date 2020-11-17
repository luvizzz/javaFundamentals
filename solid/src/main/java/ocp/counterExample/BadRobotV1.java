package ocp.counterExample;

import ocp.Cutter;

//Open closed principle
public class BadRobotV1 implements Cutter {

    String name = this.getClass().getSimpleName();

    public String cut() {
        return String.format("I am a %s, I can cut!", name);
    }
}
