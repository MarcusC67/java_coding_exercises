package com.techreturners.exercise003;

import java.util.ArrayList;
import java.util.List;

// access modifier
public class Exercise003 {

    // Declaring and initializing in one line
    // NB: Wrap the actions of adding the flavours within a method
    List<String> flavours = new ArrayList<>(); {
        flavours.add("Pistachio");
        flavours.add("Raspberry Ripple");
        flavours.add("Vanilla");
        flavours.add("Mint Chocolate Chip");
        flavours.add("Chocolate");
        flavours.add("Mango Sorbet");
    }

    /* Return Index Number of Ice Cream Flavour = Ice Cream Code 0 - 5 */
    int getIceCreamCode(String iceCreamFlavour) { return flavours.indexOf(iceCreamFlavour); }

    String[] iceCreamFlavours() {
        String[] allFlavours = new String[flavours.size()];
        /* Obtain a string array from a string ArrayList by using
        method to convert arrayList to array */
        flavours.toArray(allFlavours);
        return allFlavours;
    }

}
