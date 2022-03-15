package com.techreturners.exercise001;

import com.sun.org.apache.xpath.internal.functions.FuncCount;

import java.util.List;
import java.util.ListIterator;

public class Exercise001 {
    public String capitalizeWord(String word) {
        // Add your code here
        return Character.toUpperCase(word.charAt(0)) + word.substring(1);
    }

    public String generateInitials(String firstName, String lastName) {
        // Add your code here
        return Character.toUpperCase(firstName.charAt(0)) + "." + Character.toUpperCase(lastName.charAt(0));
    }

    public double addVat(double originalPrice, double vatRate) {
        // Add your code here
        return originalPrice + Math.round(vatRate*originalPrice)/100.0;
    }

    public String reverse(String sentence) {
        // Add your code here
        return new StringBuilder(sentence).reverse().toString();
    }

    public int countLinuxUsers(List<User> users) {
        // Add your code here
        int count = 0;
        // Iterating ArrayList -
        // If ArrayList:Type = Linux add to count
        for(User str:users) {
            if (str.getType().equals("Linux")) {
                count++;
            }
        }
        return count;

        //for (Customer customer : customers) {
        //        if (customer.getName().equals(name)) {
        //            return customer;
        //        }
        //    }
        // Other options = Iterator loop
        //
        // or Stream API = .filter(str -> "Linux".equals(str.getType("")))
        //
        // EG: memberNames.stream().filter((s) -> s.startsWith("A"))
        //                    .forEach(System.out::println);
    }
}
