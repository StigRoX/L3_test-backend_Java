package com.geekbrains;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PalindromeCheckerTest {

    @Test
    public void testIsPalindromeCaseSensitiveNegativeTest() {
        String word = "Abba";
        String msg = "\"" + word +
                "\" shouldn't be considered palindromic";
        assertFalse(PalindromeChecker.isPalindrome(word), msg);
    }

    @Test
    public void testIsPalindromeIsCaseSensitivePositiveTest() {
        String word = "abba";
        String msg = "\"" + word +
                "\" should be considered palindromic";
        assertTrue(PalindromeChecker.isPalindrome(word), msg);
    }

    @Test
    public void testIsPalindromeEmojiPositiveTest() {
        String emoji = "😁😍😁";
        String msg = "\"" + emoji +
                "\" should be considered palindromic";
        assertTrue(PalindromeChecker.isPalindrome(emoji), msg);
    }

    @Test
    public void testIsNotPalindromeEmojiNegativeTest() {
        String emoji = "😁🥲😁😍";
        String msg = "\"" + emoji +
                "\" shouldn't be considered palindromic";
        assertFalse(PalindromeChecker.isPalindrome(emoji), msg);
    }

    @Test
    public void testIsPalindromeConsidersSpacesNegativeTest() {
        String wordNotPalindromeWithSpaces = "a  aab a aa";
        String msg = "\"" + wordNotPalindromeWithSpaces +
                "\" shouldn't be considered palindromic";
        assertFalse(PalindromeChecker.isPalindrome(wordNotPalindromeWithSpaces), msg);
    }

    @Test
    public void testIsPalindromeConsidersSpacesPositiveTest() {
        String word = " a aabaa a ";
        String msg = "\"" + word +
                "\" should be considered palindromic";
        assertTrue(PalindromeChecker.isPalindrome(word), msg);
    }

    @Test
    public void testIsPalindromeConsidersCharactersPositiveTest() {
        String word = "i'mm'i";
        String msg = "\"" + word +
                "\" should be considered palindromic";
        assertTrue(PalindromeChecker.isPalindrome(word), msg);
    }

    @Test
    public void testIsPalindromeConsidersCharactersNegativeTest() {
        String word = "i'mami";
        String msg = "\"" + word +
                "\" shouldn't be considered palindromic";
        assertFalse(PalindromeChecker.isPalindrome(word), msg);
    }
}
