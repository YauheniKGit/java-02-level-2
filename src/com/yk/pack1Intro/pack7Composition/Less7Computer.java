package com.yk.pack1Intro.pack7Composition;

public class Less7Computer {

    private Ram ram;
    private Ssd ssd;

    public Less7Computer(Ram ram, Ssd ssd) {
        this.ram = ram;
        this.ssd = ssd;
    }

    public void printState() {
        System.out.println("Computer: ram " + ram.getRam() + ", SSD " + ssd.getSsd());
    }
}
