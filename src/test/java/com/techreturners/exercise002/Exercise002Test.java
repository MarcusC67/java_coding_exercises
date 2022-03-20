package com.techreturners.exercise002;

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;

public class Exercise002Test {

    @Test
    // test method
    public void checkIsFromManchester() {
        // Arrange - setting up the objects needed for tests
        Exercise002 ex002 = new Exercise002();

        Person p1 = new Person("Peter", "Smith", "Manchester", 23);
        Person p2 = new Person("Susan", "Farmer", "Leeds", 23);

        // Act - action you take, ie: run the code you want to test
        // Assert - what you are testing for - actual vs. expected result
        assertEquals(true, ex002.isFromManchester(p1));
        assertEquals(false, ex002.isFromManchester(p2));
    }

    @Test
    public void checkCanWatchFilm() {
        Exercise002 ex002 = new Exercise002();

        Person p1 = new Person("Peter", "Smith", "Manchester", 17);
        Person p2 = new Person("Francis", "Farmer", "Leeds", 18);

        assertEquals(false, ex002.canWatchFilm(p1, 18));
        assertEquals(true, ex002.canWatchFilm(p2, 18));
    }
}
