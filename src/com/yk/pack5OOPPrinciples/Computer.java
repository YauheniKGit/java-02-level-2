package com.yk.pack5OOPPrinciples;

public abstract class Computer implements Printable{

    private Ssd ssd;
    private Ram ram;

    static {
        System.out.println("static init block computer");
    }

    {
        System.out.println("init block computer");
    }

    public Computer()  {
        System.out.println("Constructor computer");
    }

    public Computer(Ssd ssd, Ram ram) {
        this.ssd = ssd;
        this.ram = ram;
    }

    public abstract void load();

    @Override
    public void print() {
        System.out.println("SSD: " + ssd.getSsdValue() + "RAM: " + ram.getRam());
    }

    public Ssd getSsd() {
        return ssd;
    }

    public Ram getRam() {
        return ram;
    }

}
