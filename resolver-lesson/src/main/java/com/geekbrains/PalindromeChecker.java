package com.geekbrains;

public class PalindromeChecker {

    /**
     * Написать 2-3 метода которые что то делают
     * и сделать на каждый необходимый набор юнит тестов
     * */
    // TODO: 29.08.2022

    // A roza upala na Lapu Azora
    // 1) abba
    // 2) aba
    // 3) a  aab a aa
    // 4) a  aab a a
    // 5) abbc
    // 6) Ab bB a

    public static boolean isPalindrome(String s) {
        StringBuilder intermediate = new StringBuilder(s);
        return s.equals(intermediate.reverse().toString());
    }
}
