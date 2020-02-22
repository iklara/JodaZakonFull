package com.poker;



public enum Ecolor {

    SPADES(1),
    HEARTS(2),
    DIAMONDS(3),
    CLUBS(3);

    int color;

    private Ecolor(int color) {
        this.color = color;
    }

    public int getColor() {
        return color;
    }
}
