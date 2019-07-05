package com.example.week3codingtest;

public class Q2StringAndSubString {

    public static void main(String[] args) {

        System.out.println(strCopies("catcowcat", "cat", 2));
        System.out.println(strCopies("catcowcat", "cow", 2));
        System.out.println(strCopies("catcowcat", "cow", 1));

    }

    public static boolean strCopies(String aString, String aSub, int n) {

        if(n == 0)
            return true;

        if(aString.length() < aSub.length())
            return false;

        if(aString.substring(0, aSub.length()).equals(aSub))
            return strCopies(aString.substring(1), aSub, n-1);

        return strCopies(aString.substring(1), aSub, n);
    }
}
