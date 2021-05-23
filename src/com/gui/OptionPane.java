package com.gui;

import javax.swing.*;

public class OptionPane {

    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog(null, "What is your name? ");
        int choice = JOptionPane.showConfirmDialog(null, "Do you like me? ");
        if (choice==JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null, "I Love You too "+ name, "My Response", JOptionPane.INFORMATION_MESSAGE);
        }
        else {
            JOptionPane.showMessageDialog(null, "I don't like you too. ", "My Response", JOptionPane.ERROR_MESSAGE);
        }
    }
}
