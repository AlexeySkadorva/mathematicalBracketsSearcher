package com.onde;

public class Main {

    private static char OPENING_QUOTATION_MARK_CHAR_VALUE = "(".charAt(0);
    private static char CLOSING_QUOTATION_MARK_CHAR_VALUE = ")".charAt(0);


    public static void main(String[] args) {
        String brackets = "()()())";

        System.out.println(isMathematicalBracketsCorrects(brackets));
    }

    private static boolean isMathematicalBracketsCorrects(String brackets) {
        int counter = 0;

        for (int i = 0; i < brackets.length(); i++) {
            char currentElement = brackets.charAt(i);

            if (OPENING_QUOTATION_MARK_CHAR_VALUE == currentElement) {
                counter++;
            } else if (CLOSING_QUOTATION_MARK_CHAR_VALUE == currentElement) {
                counter--;
            }

            if (counter < 0) {
                return false;
            }
        }

        return counter == 0;
    }

}
