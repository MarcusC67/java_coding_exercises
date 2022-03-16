package com.techreturners.exercise003;

import java.util.ArrayList;
import java.util.List;

public class Exercise003 {

    // Declaring and initializing in one line:
    List<String> iceCreamFlavours = new ArrayList<String>();

    iceCreamFlavours.add("Pistachio");
    iceCreamFlavours.add("Raspberry Ripple");
    iceCreamFlavours.add("Vanilla");
    iceCreamFlavours.add("Mint Chocolate Chip");
    iceCreamFlavours.add("Chocolate");
    iceCreamFlavours.add("Mango Sorbet");

    /* Return Index Number of Ice Cream Flavour = Ice Cream Code 0 - 5 */
    int getIceCreamCode(String iceCreamFlavour) {
        return iceCreamFlavours.indexOf(iceCreamFlavour);
    }

    String[] iceCreamFlavours() {
        return iceCreamFlavours;
    }
}
