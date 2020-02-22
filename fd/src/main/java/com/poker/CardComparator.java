package com.poker;



import java.util.Comparator;

public class CardComparator implements Comparator<Card> {


    @Override
    public int compare(Card card1, Card card2) {
        return card1.evalue.getValue() - card2.evalue.getValue();
    }

    @Override
    public Comparator<Card> reversed() {
        return null;
    }

}
