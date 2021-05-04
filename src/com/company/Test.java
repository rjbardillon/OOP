package com.company;

import java.util.Arrays;

public class Test {
    int[] g = new int[2];

    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int[] c = new int[10];
        char[] chars = {'a', 'c', 'c', 'x', 'y', 'z'};
        char[] chars1 = {'a', 'A', '4', 'F', 'D', 'P'};


        System.out.println(Arrays.binarySearch(chars, 't'));
        Arrays.sort(chars1);
        System.out.println(chars1);
        System.out.println(Test.linearSearch(chars, 'c'));
        System.out.println(max((double) a, b));
        int[] ab = m(b, c);
        b = ab[0];
        c[0] = ab[1];

        System.out.println(b + " " + c[0]);

        Test test = new Test();

        test.g[0] = 500;
        test.g[1] = test.g[0];
        System.out.println(String.join("", Arrays.toString(new Test().g(test.g))));
    }

    public static int linearSearch(char[] list, int key) {
        for (int i = 0; i < list.length; i++)
            if (key == list[i])
                return i;
        return -1;
    }

    public static double max(int num1, double num2) {
        if (num1 > num2) {
            return num1;
        } else if (num1 < num2) {
            return num2;
        } else
            return num1;
    }

    public static double max(double num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else if (num1 < num2) {
            return num2;
        } else
            return num1;
    }

    public static int[] m(int a, int[] b) {
        a = 500;
        b[0] = 5555;
        int[] cd = {a, b[0]};

        return cd;
    }

    public int[] g(int[] g) {
        g[0] = 1000;

        return g;
    }
}
