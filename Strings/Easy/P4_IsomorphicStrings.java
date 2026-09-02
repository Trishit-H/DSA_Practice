// Isomorphic String

// Given two strings s and t, determine if they are isomorphic. Two strings s and t are isomorphic if 
// the characters in s can be replaced to get t. All occurrences of a character must be replaced with 
// another character while preserving the order of characters. No two characters may map to the same 
// character, but a character may map to itself.

package Strings.Easy;

import java.util.HashMap;

public class P4_IsomorphicStrings {

    public static boolean isIsomorphic(String s, String t) {

        // different length strings cannot be isomorphic
        if (s.length() != t.length()) {
            return false;
        }

        // s -> t mapping
        HashMap<Character, Character> mapST = new HashMap<>();

        // t -> s mapping
        HashMap<Character, Character> mapTS = new HashMap<>();

        // traverse both strings
        for (int i = 0; i < s.length(); i++) {

            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            // sChar is already mapped
            if (mapST.containsKey(sChar)) {

                // existing mapping must match current tChar
                if (mapST.get(sChar) != tChar) {
                    return false;
                }
            }

            // sChar is not already mapped
            else {

                // tChar is already mapped to another character
                if (mapTS.containsKey(tChar)) {
                    return false;
                }

                // create mapping in both direction
                mapST.put(sChar, tChar);
                mapTS.put(tChar, sChar);
            }
        }

        // no contradication found, strings are isomorphic
        return true;
    }

    public static void main(String[] args) {

        String s = "paper";
        String t = "title";

        System.out.println(isIsomorphic(s, t));
    }
}
