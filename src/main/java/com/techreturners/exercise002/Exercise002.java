package com.techreturners.exercise002;

// access modifier
public class Exercise002 {

    // method signature
    // access modifier
    // return data type - true/false
    // method name
    // parameters
    public boolean isFromManchester(Person person) {
        // Return True if Manchester
        return (person.getCity().equals("Manchester"));
    }

    public boolean canWatchFilm(Person person, int ageLimit) {
        // If Age GE 18 return true otherwise return false
        return (person.getAge() >= ageLimit);
    }
    
}
