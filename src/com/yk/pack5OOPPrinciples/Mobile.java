package com.yk.pack5OOPPrinciples;

public final class Mobile extends Computer {

    public Mobile(Ssd ssd, Ram ram) {
        super(ssd, ram);
    }

    @Override
    public void load() {
        System.out.println("Mobile loaded");
    }
}
