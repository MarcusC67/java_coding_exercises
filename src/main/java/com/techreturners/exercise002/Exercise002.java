package com.techreturners.exercise002;

public class Exercise002 {

    public boolean isFromManchester(Person person) {
        // Add your code here
        // if (person.getCity().equals("Manchester")) {
        //     return true;
        // }

        // Return True if Manchester
        return (person.getCity().equals("Manchester"));
    }

    public boolean canWatchFilm(Person person, int ageLimit) {
        // Add your code here
        // If Age GE 18 return true otherwise return false
        return (person.getAge() >= ageLimit);
    }
    
}
