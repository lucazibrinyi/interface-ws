package com.codecool.interfaceWS;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Ladybird lb1 = new Ladybird("Bogyó", true);
        Ladybird lb2 = new Ladybird("Katica", false);

        Bird b1 = new Bird("Pityuka", false);
        Bird b2 = new Bird ("Csőrike", true);

        lb1.fly();
        lb2.fly();
        b1.fly();
        b2.fly();

        lb1.feed();
        lb2.feed();
        b1.feed();
        b2.feed();
        /*
        Imola megoldása:
        List<Flying> animals = new ArrayList();
        animals.add(new Ladybird("Katica", false));
        ...

        for(Flying animal: animals){
        animal.fly();
        }
         */
    }
}
