package com.yk.pack5OOPPrinciples;

public class Computer {

    private Ssd ssd;
    private Ram ram;

    public Computer(Ssd ssd, Ram ram) {
        this.ssd = ssd;
        this.ram = ram;
    }

    public void load(){
        System.out.println("Loaded");


    }



}
