package edu.bi.chapfour;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        giveIntro();

        System.out.print("What would you like to say? ");
        String s = console.next();
        System.out.print("How many times would you like to say it? ");
        int x = console.nextInt();
        System.out.println("");

        for (int i = x; i > 0; i--);
        System.out.print(s);
    }

    public static void giveIntro() {
        System.out.println("This program accepts a sentence");
        System.out.println("and repeats it a number of times.");
        System.out.println("");
    }
}
