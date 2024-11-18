package com.yk.pack1Intro.pack8PracticeTimeInter;

public class Less8TimeInterval {
    private int seconds;
    private int minutes;
    private int hours;

    public Less8TimeInterval(int totalSeconds) {
        this.seconds = totalSeconds;
    }

    public Less8TimeInterval(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getTotalSeconds() {
        return hours * 60 * 60 + minutes * 60 + seconds;
    }

    public void getSplitSeconds() {
        hours = seconds / 3600;
        this.minutes = seconds % 3600 / 60;
        this.seconds = seconds % 3600 % 60;
    }

    public Less8TimeInterval getSumSeconds(Less8TimeInterval less8TimeInterval) {
        return new Less8TimeInterval(getTotalSeconds() + less8TimeInterval.getTotalSeconds());
    }

    public void printState() {
        System.out.println(hours + " " + minutes + " " + seconds);
    }

}
