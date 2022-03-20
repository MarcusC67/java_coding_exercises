package com.techreturners.exercise001;

import java.util.List;

// access modifier
public class Exercise001 {

    public String capitalizeWord(String word) {
        // Capitalise first letter of word
        return Character.toUpperCase(word.charAt(0)) + word.substring(1);
    }

    public String generateInitials(String firstName, String lastName) {
        // Generate Initials
        return Character.toUpperCase(firstName.charAt(0)) + "." + Character.toUpperCase(lastName.charAt(0));
    }

    public double addVat(double originalPrice, double vatRate) {
        // Add VAT to original price - float point numbers
        return originalPrice + Math.round(vatRate*originalPrice)/100.0;
    }

    public String reverse(String sentence) {
        // Reverse the string
        return new StringBuilder(sentence).reverse().toString();
    }

    public int countLinuxUsers(List<User> users) {
        int count = 0;
        // Iterating ArrayList -
        // If ArrayList:Type = Linux add to count
        for(User str:users) {
            if (str.getType().equals("Linux")) {
                count++;
            }
        }
        return count;

    }
}
