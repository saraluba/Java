package OnlineStore;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Catalogue{
    public static void main(String[] args) {
        List<Item> itemsList = new ArrayList<>();
        itemsList.add(new Item("piano",5000));
        itemsList.add(new Item("violin", 1500));
        itemsList.add(new Item("xylophone", 80));
        itemsList.add(new Item("drums", 1599));
        itemsList.add(new Item("trumpet", 1750));

        System.out.println("Sorted by item name:");
        itemsList.sort(new ItemByNameCamparator());
        for (int i = 0; i < itemsList.size(); i++) {
            System.out.println(itemsList.get(i).getName() + " :" + itemsList.get(i).getPrice());
        }
        System.out.println("===================");
        itemsList.sort(new ItemByNameCamparator().reversed());
        System.out.println("Reversed order (by name):");
        for (int i = 0; i < itemsList.size(); i++) {
            System.out.println(itemsList.get(i).getName() + " :" + itemsList.get(i).getPrice());
        }

        System.out.println("===================");
        System.out.println("Sorted by price from the cheapest: ");
        itemsList.sort(Comparator.naturalOrder());
        for (int i = 0; i < itemsList.size(); i++) {
            System.out.println(itemsList.get(i).getName() + " :" + itemsList.get(i).getPrice());
        }

        System.out.println("===================");
        System.out.println("Sorted by price from the most expensive: ");
        itemsList.sort(Comparator.reverseOrder());
        for (int i = 0; i < itemsList.size(); i++) {
            System.out.println(itemsList.get(i).getName() + " :" + itemsList.get(i).getPrice());
        }

    }
}
