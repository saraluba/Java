package Zad2004;

import java.util.ArrayList;
import java.util.List;

public class UniqueSymbols {
    public static void main(String[] args) {
        String text = "This is a test text!";
        List<Character> uniqueSymbols = new ArrayList<>();
        for (int i = 0; i < text.length() ; i++) {
            if(!uniqueSymbols.contains(text.charAt(i))){
                uniqueSymbols.add(text.charAt(i));
            }
        }
        System.out.println(uniqueSymbols);
    }



}
