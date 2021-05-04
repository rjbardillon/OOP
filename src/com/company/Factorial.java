package com.company;

public class Factorial {
    public static int factorial(int num){
        int ans = num;
        for (int i=1; num > 1 ;num--){
           ans = ans*(num-i);
        }
        return ans;
    }
    public static void main(String[] args){
        System.out.println(factorial(4));
    }
}
