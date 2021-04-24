package OnlineStore;

public class Item implements Comparable<Item> {
    protected String name;
    protected int price;

    public Item(String name, int price){
        this.name = name;
        this.price = price;
    }

    public String getName(){
        return name;
    }

    public int getPrice(){
        return price;
    }


    @Override
    public int compareTo(Item anotherItem) {
        return this.price - anotherItem.price;
    }
}
