package com.yk.pack4String;

import java.util.Arrays;

public class Less11StringRunner {

    public static void main(String[] args) {

        Less11StringRunner less11StringRunner = new Less11StringRunner();
//        System.out.println(less11StringRunner.replaceCharInString(":)"));
//        System.out.println(less11StringRunner.isStringStartAndEndWithWord("Hello world string Hello", "Hello"));
//        System.out.println(less11StringRunner.getNameInitials("Kastsiukou", "Yauheni", "Aliaksandrovich"));
//        System.out.println( less11StringRunner.countParticularCharInString("fwef,weferger&30&*fre.") );
        String[] result = less11StringRunner.splitStringByNSymbols("123456", 4);
        System.out.println(Arrays.toString(result));
    }

    public String replaceCharInString(String string) {
        String initialStringInstance = "Hello world :(, :(, :)";
        return initialStringInstance.replace(":(", string);
    }

    public boolean isStringStartAndEndWithWord(String string, String word) {
        return string.startsWith(word) && string.endsWith(word);
    }

    public String getNameInitials(String surname, String name, String patronymic) {
        return String.format("%s.%s.%s.", surname.charAt(0), name.charAt(0), patronymic.charAt(0)).toUpperCase();
    }

    public int countParticularCharInString(String string) {
        String result = string.replace(".", "")
                .replace(",", "")
                .replace("!", "");
        return string.length() - result.length();
    }

    public String[] splitStringByNSymbols(String stringValues, int lengthOfSplitString) {
        int arraySize = (int) Math.ceil(stringValues.length() / (double) lengthOfSplitString);
        String[] resultValuesArray1D = new String[arraySize];

        int counter = 0;
        for (int i = 0; i < stringValues.length(); i+=lengthOfSplitString ) {
            int endIndex = Math.min(stringValues.length(), i + lengthOfSplitString);
            String subString = stringValues.substring(i, endIndex);
            resultValuesArray1D[counter++] = subString;
        }
        return resultValuesArray1D;
    }

}
