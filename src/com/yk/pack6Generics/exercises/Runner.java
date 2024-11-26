package com.yk.pack6Generics.exercises;

public class Runner {

    public static void main(String[] args) {

        Integer[] array1 =  {1, 2, 3};
        Integer[] array2 =  {1, 2, 6};

        String[] array3 =  {"1", "2", "3"};
        String[] array4 =  {"d", "e", "f"};

        int[] array23 = new int[] {1, 2, 4};

        GenericClass genericClass = new GenericClass();
        genericClass.isArrayEqual(array1, array2);

    }



}
