package com.poker;



//lista 52 kart
//kolor to enumm
//liczba to enum
//
//
//interfejs z tasowaniem, wybieraniem, oraz klasa z komparatorem

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Maincards {

    public static void main(String[] args) {
        Card card = new Card();
        card.chooseCard();
        List list = new ArrayList(card.shuffling());
        Collections.sort(list, new CardComparator());
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
        //1Losowanie.reka();
    }

}
