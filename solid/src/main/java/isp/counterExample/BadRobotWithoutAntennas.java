package isp.counterExample;

//Interface segregation principle
public class BadRobotWithoutAntennas implements WhatAllRobotsDo {

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
    public String wiggleAntennas() throws Exception {
        throw new Exception(String.format("[%s] Oops! but I don't have antennas", name));
    }
}
