package com;

public class Demo {
    public static void main(String[] args) {
        String str = "David1000-Warner";
        String separator ="-";
        int sepPos = str.lastIndexOf(separator);
        if (sepPos == -1) {
            System.out.println("");
        }
        String output = str.substring(0,sepPos);
        System.out.println("Substring before last separator = "+output.replaceAll("[^0-9]", ""));
    }
}