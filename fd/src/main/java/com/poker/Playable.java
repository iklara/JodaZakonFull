package com.poker;



import java.util.HashSet;

public interface Playable {

    public Card chooseCard();

    public HashSet<Card> shuffling();

}
