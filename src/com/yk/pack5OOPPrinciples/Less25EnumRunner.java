package com.yk.pack5OOPPrinciples;

import java.util.Arrays;

public class Less25EnumRunner {

    public static void main(String[] args) {
        Less25ProcessorTypeEnum bit32 = Less25ProcessorTypeEnum.BIT_32;
        System.out.println(bit32);
        System.out.println(bit32.name() );
        System.out.println(bit32.toString());
        System.out.println(Less25ProcessorTypeEnum.valueOf("BIT_32"));
        System.out.println(Arrays.toString(Less25ProcessorTypeEnum.values()));
        System.out.println(Less25ProcessorTypeEnum.BIT_32.ordinal());
        System.out.println(Less25ProcessorTypeEnum.BIT_64.getName());
        System.out.println(bit32.getDescription());

    }
}
