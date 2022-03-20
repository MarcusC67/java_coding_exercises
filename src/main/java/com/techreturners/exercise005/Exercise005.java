package com.techreturners.exercise005;

// access modifier
public class Exercise005 {

    // Boolean method - return true or false
    public boolean isPangram(String input) {

        String str = input;

        //Array to store counts of alphabet letters
        int count[] = new int[26];
        boolean flag = true; //Assume input is a pangram

        /*
        ch = lower case a to z = ascii 97 - 122
        ch = upper case A to Z = ascii 65 - 90
        */
        char ch;

        //Loop through each character of input string
        for (int i = 0; i < str.length(); i++) {

            // set ch = each char from input string
            ch = str.charAt(i);

            // if ch = null jump to next ch in loop
            if (ch == ' ')
                continue;

            // If char a-z or A-Z
            if (ch >= 'A' && ch <= 'Z') {

                int position = ch - 'A'; // get position - a 65 - a 65 = 0, b 66 - a 65 = 1, c 67 - a 65 = 2
                count[position] = count[position] + 1; // increment the count in that particular position
                // count[ch - 'A']++;

            } else if (ch >= 'a' && ch <= 'z') {

                int position = ch - 'a'; // get position - a 97 - a 97 = 0, b 98 - a 97 = 1, c 99 - a 97 = 2
                count[position] = count[position] + 1; // increment the count in that particular position
                // count[ch-'a']++;
            }

        }

        //checking if count array has any zeros
        for (int i = 0; i < count.length; i++) {
            if (count[i] == 0) {
                flag = false; // Not a Pangram
                break;
            }
        }

        if (flag)
            return true;
        else
            return false; // Not a Pangram

    }

}
