package Zad2004;

import java.util.*;

public class UniqueSymbols {
    public static void main(String[] args) {
        String text = "This is a test text!";
        Set<Character> uniqueSymbols = new LinkedHashSet<>();
        for (int i = 0; i < text.length() ; i++) {
            uniqueSymbols.add(text.charAt(i));
        }
        System.out.println(uniqueSymbols);
    }
    
}
