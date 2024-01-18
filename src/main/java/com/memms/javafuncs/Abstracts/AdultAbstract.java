package com.memms.javafuncs.Abstracts;

public class AdultAbstract extends HumanAbstract {
    @Override
    public String read() {
        return "Adult is reading";
    }

    public String walk() {
        return "Adult is walking";
    }
}
