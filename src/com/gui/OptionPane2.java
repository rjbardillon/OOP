package com.gui;

import javax.swing.*;

public class OptionPane2 {
    public static void main(String[] args){
        String birthYearString = JOptionPane.showInputDialog(null, "Enter your birth year? ");
        int birthYear = Integer.parseInt(birthYearString);
        int age = 2021 - birthYear;
        String moneyString = JOptionPane.showInputDialog(null, "How much money do you have? ");
        double money = Double.parseDouble(moneyString);

        JOptionPane.showMessageDialog(null, "You are "+age+" years old. And you have "+moneyString+" Pesos.");
        for (int i=0; i<4; i++){
            money+=money*2;
        }
        JOptionPane.showMessageDialog(null, "If you double your money each year until 2025 you will have "+money+" Pesos.");
    }
}
