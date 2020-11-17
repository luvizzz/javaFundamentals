package isp.counterExample;

//Interface segregation principle
public interface WhatAllRobotsDo {

    String spinAround();

    String rotateArms();

    String wiggleAntennas() throws Exception;
}
