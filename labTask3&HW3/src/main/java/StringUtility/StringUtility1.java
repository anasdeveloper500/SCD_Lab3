/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StringUtility;
import java.util.Arrays;
/**
 *
 * @author DELL
 */
public class StringUtility1 {

  public boolean isPalindrome(String s) {

        if (s == null || s.isEmpty()) {
            return false;
        }

        String clean = s.replaceAll("[^A-Za-z]", "").toLowerCase();

        if (clean.isEmpty()) {
            return false;
        }

        String reversed = new StringBuilder(clean).reverse().toString();

        return clean.equals(reversed);
    }


    public int countVowels(String s) {

        if (s == null || s.isEmpty()) {
            return 0;
        }

        int count = 0;

        s = s.toLowerCase();

        for (char c : s.toCharArray()) {

            if (c == 'a' || c == 'e' || c == 'i'
                    || c == 'o' || c == 'u') {

                count++;
            }
        }

        return count;
    }


    public boolean isAnagram(String s1, String s2) {

        if (s1 == null || s2 == null
                || s1.isEmpty() || s2.isEmpty()) {

            return false;
        }

        String clean1 = s1.replaceAll("[^A-Za-z]", "").toLowerCase();
        String clean2 = s2.replaceAll("[^A-Za-z]", "").toLowerCase();

        if (clean1.isEmpty() || clean2.isEmpty()) {
            return false;
        }

        char[] array1 = clean1.toCharArray();
        char[] array2 = clean2.toCharArray();

        Arrays.sort(array1);
        Arrays.sort(array2);

        return Arrays.equals(array1, array2);
    }
}
