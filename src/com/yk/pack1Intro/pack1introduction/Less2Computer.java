package com.yk.pack1Intro.pack1introduction;

public class Less2Computer {

    private int ssd = 750;
    private int ram;

    public Less2Computer() {
        System.out.println("Instance was created");
    }

    protected Less2Computer(int ssd, int ram) {
        this.ssd = ssd;
        this.ram = ram;
    }

    public void load() {
        System.out.println("Computer loaded");
    }

    public void printState() {
        System.out.println("SSD: " + ssd + " Ram: " + ram);
    }

    public int getSSD() {
        return ssd;
    }

    public void setSSD(int ssd) {
        this.ssd = ssd;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }


}
