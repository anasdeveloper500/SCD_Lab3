/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package StringUtility;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
/**
 *
 * @author DELL
 */
public class StringUtility1Test {

    StringUtility1 analyzer = new StringUtility1();


    @Test
    @DisplayName("Madam should be identified as a palindrome")
    public void testPalindrome() {

        assertTrue(analyzer.isPalindrome("madam"));
    }


    @Test
    @DisplayName("Palindrome check should ignore uppercase and lowercase")
    public void testCaseInsensitivePalindrome() {

        assertTrue(analyzer.isPalindrome("RaceCar"));
    }


    @Test
    @DisplayName("Hello should not be identified as a palindrome")
    public void testNotPalindrome() {

        assertFalse(analyzer.isPalindrome("hello"));
    }


    @Test
    @DisplayName("Null palindrome input should return false")
    public void testNullPalindrome() {

        assertFalse(analyzer.isPalindrome(null));
    }


    @Test
    @DisplayName("Empty palindrome input should return false")
    public void testEmptyPalindrome() {

        assertFalse(analyzer.isPalindrome(""));
    }


    // VOWEL COUNT TESTS

    @Test
    @DisplayName("Hello should contain two vowels")
    public void testVowelCount() {

        assertEquals(2, analyzer.countVowels("Hello"));
    }


    @Test
    @DisplayName("AEIOU should contain five vowels")
    public void testAllVowels() {

        assertEquals(5, analyzer.countVowels("AEIOU"));
    }


    @Test
    @DisplayName("String without vowels should return zero")
    public void testNoVowels() {

        assertEquals(0, analyzer.countVowels("xyz"));
    }


    // ANAGRAM TESTS

    @Test
    @DisplayName("Listen and Silent should be anagrams")
    public void testAnagram() {

        assertTrue(analyzer.isAnagram("listen", "silent"));
    }


    @Test
    @DisplayName("Anagram check should ignore uppercase and lowercase")
    public void testCaseInsensitiveAnagram() {

        assertTrue(analyzer.isAnagram("Listen", "SILENT"));
    }


    @Test
    @DisplayName("Hello and World should not be anagrams")
    public void testNotAnagram() {

        assertFalse(analyzer.isAnagram("hello", "world"));
    }


    @Test
    @DisplayName("Null anagram input should return false")
    public void testNullAnagram() {

        assertFalse(analyzer.isAnagram(null, "test"));
    }


    @Test
    @DisplayName("Empty anagram input should return false")
    public void testEmptyAnagram() {

        assertFalse(analyzer.isAnagram("", "test"));
    }
}