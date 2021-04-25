package Zad2004;

import java.util.HashMap;

public class Catalogue {
    HashMap<Integer, Part> catalogue = new HashMap<>();

    public void putToCatalogue(Part part){
        catalogue.put(part.partNumber, part);
    }

    public void printPart(int number){
        if(catalogue.containsKey(number)){
            System.out.println(catalogue.get(number));
        } else{
            System.out.printf("There is no part with number %d%n", number);
        }
    }
