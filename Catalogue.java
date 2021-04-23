package Zad2004;

import java.util.HashMap;

public class Catalogue {
    HashMap<Integer, String> catalogue = new HashMap<>();

    public void putToCatalogue(Parts part){
        catalogue.put(part.partNumber, part.name +" "+ part.brand);
    }

    public void printPart(int number){
        if(catalogue.containsKey(number)){
            System.out.println(catalogue.get(number));
        } else{
            System.out.printf("There is no part with number %d%n", number);
        }
    }
}
