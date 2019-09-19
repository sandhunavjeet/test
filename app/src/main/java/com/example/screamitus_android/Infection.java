package com.example.screamitus_android;

public class Infection {

    int calculateTotalInfected(int day) {
        if (day <= 0) return -1;
        if (day % 2 == 0) {
            return 0;
        } else {
            if (day > 0 && day <= 7) return 5 * day;
            else {
                return 35 + (day - 7) * 8;
            }
        }
    }
}

