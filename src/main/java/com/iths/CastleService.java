package com.iths;

import jakarta.inject.Singleton;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Singleton
public class CastleService {

    private static final List<Castle> CASTLES = Arrays.asList(
            new Castle("Malbork slott"),
            new Castle("Mehrangarh Fort"),
            new Castle("Prags slott"),
            new Castle("Windsor slott"),
            new Castle("Hohensalzburg fästning"),
            new Castle("Spiš slott"),
            new Castle(" Buda slott"),
            new Castle("Himeji Castle"),
            new Castle("Citadellet i Aleppo"),
            new Castle("Edinburgh slottet")
    );

    public Castle randomCastle() {
        return CASTLES.get(new Random().nextInt(CASTLES.size()));
    }
}