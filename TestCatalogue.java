package Zad2004;

public class TestCatalogue {
    public static void main(String[] args) {
        Catalogue katalog = new Catalogue();
        Parts part1 = new Parts(1, "brand", "name");
        Parts part2 = new Parts(124, "brand2", "name2");
        Parts part3 = new Parts(4, "brand3", "name3");
        katalog.putToCatalogue(part1);
        katalog.putToCatalogue(part2);
        katalog.putToCatalogue(part3);
        katalog.printPart(4);
        katalog.printPart(3);
        katalog.printPart(353);
        katalog.printPart(124);
    }
}
