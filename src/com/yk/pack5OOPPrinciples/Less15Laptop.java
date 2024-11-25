package com.yk.pack5OOPPrinciples;

public final class Less15Laptop extends Computer {

    private int weight;

    static {
        System.out.println("static init block laptop");
    }

    {
        System.out.println("init block laptop");
    }

    public Less15Laptop() {
        System.out.println("Constructor laptop");
    }

    public Less15Laptop(Ssd ssd, Ram ram, int weight) {
        super(ssd, ram);
        this.weight = weight;
    }

    @Override
    public void load() {
        open();
        System.out.println("Laptop loaded");
    }

    @Override
    public void print() {
       super.print();
        System.out.println("Weight: " + getWeight());

    }

    public int getWeight() {
        return weight;
    }

    public void open() {
        System.out.println("Laptop opened");
    }

}
