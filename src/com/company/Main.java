package com.company;

import java.util.Random;
import java.util.regex.Matcher;

public class Main {

    public static void main(String[] args) {

        int dieNumber;
        Random rnd = new Random();
        dieNumber = rnd.nextInt(6) + 1;

        System.out.println("Your die roll was : " + dieNumber);

    }
}
