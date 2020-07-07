package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(longestPalindrome("OOOQQQQQQPPP"));
    }

    public static String longestPalindrome(String s) {
        String longestpalindrome = "";
        String currentstring;
        for (int i = 0; i < s.length(); i++) {
            for (int j = s.length(); j > i; j--) {
                currentstring = s.substring(i, j);
                if (ispalindrome(currentstring)) {
                    if (longestpalindrome.equals("") || longestpalindrome.length() < currentstring.length()) {
                        longestpalindrome = currentstring;
                    }
                }
            }
        }


        return longestpalindrome;
    }

    public static boolean ispalindrome(String s) {
        int q = s.length() - 1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(q)) {
                q--;
            } else {
                return false;
            }
        }
        return true;
    }

}
