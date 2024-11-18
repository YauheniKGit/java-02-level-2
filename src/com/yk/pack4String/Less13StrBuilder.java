package com.yk.pack4String;

public class Less13StrBuilder {

    public static void main(String[] args) {
        Less13StrBuilder less13StrBuilder = new Less13StrBuilder();
        less13StrBuilder.callUsualString();
        less13StrBuilder.callStringBuilder();
    }

    public void callUsualString() {
        long startTime = System.currentTimeMillis();
        String value = new String();
        for (int i = 0; i < 1000; i++) {
            value += i;
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Execution time for usual String: " + (endTime - startTime));
    }

    public void callStringBuilder() {

        long startTime = System.currentTimeMillis();
        StringBuilder stringBuilderInstance = new StringBuilder();
        for (int i = 0; i < 100_000; i++) {
            stringBuilderInstance.append(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Execution time for usual String: " + (endTime - startTime));
    }


}
