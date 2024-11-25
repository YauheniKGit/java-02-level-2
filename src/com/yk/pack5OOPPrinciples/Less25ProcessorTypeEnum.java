package com.yk.pack5OOPPrinciples;

public enum Less25ProcessorTypeEnum implements Less25Describable {
    // enum constants
    BIT_32("bit-32"){
        @Override
        public String getDescription() {
            return "bit 32 description";
        }
    },
    BIT_64("bit-64"){
        @Override
        public String getDescription() {
            return "bit 64 description";
        }
    };

    private String name;

    Less25ProcessorTypeEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
