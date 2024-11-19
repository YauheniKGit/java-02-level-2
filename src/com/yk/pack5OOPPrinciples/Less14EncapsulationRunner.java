package com.yk.pack5OOPPrinciples;

public class Less14EncapsulationRunner {

    public static void main(String[] args) {
        Ssd ssd = new Ssd(500);
        Ram ram = new Ram(1024);
        Computer computer = new Computer(ssd, ram);

    }

}
