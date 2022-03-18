package com.techreturners.exercise004;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Exercise004 {

    // Set constant
    private final int GIGASECOND = 1000000000;

    // Initialise tempDate
    private LocalDateTime tempDate = LocalDateTime.now();

    // Set tempDate to input date plus time (start of day 00:00)
    public Exercise004(LocalDate date) {
        tempDate = date.atStartOfDay();
    }

    public Exercise004(LocalDateTime dateTime) {
        tempDate = dateTime;
    }

    public LocalDateTime getDateTime() {
        // Add 1000000000 seconds
        LocalDateTime datePlusGigaSecond = tempDate.plusSeconds(GIGASECOND);
        return datePlusGigaSecond;
    }

}
