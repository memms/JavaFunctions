package com.memms.javafuncs.Interfaces;

/**
 * Created by memms on 1/17/2024.
 * This shows that a class can implement multiple interfaces.
 */
public class Human implements Running, Walking{
    @Override
    public String run() {
        return "Human is running";
    }

    @Override
    public String walk() {
        return "Human is walking";
    }
}
