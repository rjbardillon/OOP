package com.company;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class CurrentYear {
    public static void main(String[] args){
        LocalDate today = LocalDate.now();
        LocalDate birthdate = LocalDate.of(2001, 4, 30);
        int years = Period.between(birthdate, today).getYears();
        System.out.println(years);
    }
}
