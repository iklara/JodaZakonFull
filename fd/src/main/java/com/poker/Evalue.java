package com.poker;


public enum Evalue {

    ACE(1),

    value2(2),

    value3(3),

    value4(4),

    value5(5),

    value6(6),

    value7(7),

    value8(8),

    value9(9),

    value10(10),

    JACK(11),

    QUEN(12),

    KING(13);


    int value;

    private Evalue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public int getValue(int value) {
        return value;
    }
}
