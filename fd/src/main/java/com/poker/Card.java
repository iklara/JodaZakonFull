package com.poker;



import java.util.*;

public class Card implements Playable {

    Ecolor ecolor;
    Evalue evalue;
    HashSet<Card> cards;

    public Card() {
    }

    public Card(Ecolor ecolor, Evalue evalue) {
        this.ecolor = ecolor;
        this.evalue = evalue;
    }

    @Override
    public Card chooseCard() {
        Card card = new Card();
        Ecolor[] colors = Ecolor.values();
        Evalue[] values = Evalue.values();

        Scanner scanner = new Scanner(System.in);
        System.out.println("choose color \n 1 for hearts , 2 for spades , 3 for diamond , 4 for clubs");
        card.ecolor = colors[scanner.nextInt()-1];
        System.out.println("choose value 1(ACE) to 13(KING)");

        card.evalue = values[scanner.nextInt()-1];
        System.out.println(card);
        return card;
    }

    @Override
    public HashSet<Card> shuffling() {
        HashSet<Card> deck = new HashSet<Card>();
        for (Ecolor ecolor : Ecolor.values()) {
            for (Evalue evalue : Evalue.values()) {
                Card card = new Card(ecolor, evalue);
                deck.add(card);
            }
        }
        return this.cards = deck;
    }


    @Override
    public String toString() {
        return "Talia  " +
                "Color = " + ecolor +
                ", Value = " + evalue +
                '}';
    }
}