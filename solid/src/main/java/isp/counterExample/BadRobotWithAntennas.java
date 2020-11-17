package isp.counterExample;

//Interface segregation principle
public class BadRobotWithAntennas implements WhatAllRobotsDo {

    String name = this.getClass().getSimpleName();

    @Override
    public String spinAround() {
        return String.format("I am a %s, I am spinning!", name);
    }

    @Override
    public String rotateArms() {
        return String.format("I am a %s, I am rotating my arms!", name);
    }

    @Override
    public String wiggleAntennas() {
        return String.format("I am a %s, I am wiggling my antennae!", name);
    }
}
