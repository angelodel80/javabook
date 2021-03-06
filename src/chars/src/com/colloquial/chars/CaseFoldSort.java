package com.colloquial.chars;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CaseFoldSort {

    public static void main(String[] args) throws UnsupportedEncodingException {
        System.setOut(new PrintStream(System.out,true,"UTF-8"));
        List<String> words = new ArrayList<String>();
        String letters = args[0];
        Permutations.permute(letters,words);
        printItems("unsorted items:", words);
        /*x CaseFoldSort.1 */
        Collections.sort(words,String.CASE_INSENSITIVE_ORDER);
        /*x*/
        printItems("case-insentitive sort order:",words);
    }

    // print header followed by items in list, max 6 per line
    private static void printItems(String header, List<String> items) {
        System.out.println(header);
        for (int i=1; i<=items.size();i++) {
            System.out.print(" " + items.get(i-1));
            if ((i>0 && i%6==0) || i==items.size()) System.out.println();
            else if (i<items.size()) System.out.print(",");
        }
        System.out.println();
    }




}