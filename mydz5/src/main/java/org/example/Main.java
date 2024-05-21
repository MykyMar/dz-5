package org.example;

public class Main {
    public static void main(String[] args) {

        int a = 7;
        int b = 8;
        int c = 4;
        int d = 13;

        int sum1 = a + b;
        int sum2 = c + d;

        System.out.println("Is sum1 greater? " + (sum1 > sum2));

        sum1++;
        sum2 -= 2;

        System.out.println("Is sum1 greater? " + (sum1 > sum2));
        System.out.println("Is one of them even? " +(sum1%2==0 || sum2%2==0));

    }
}