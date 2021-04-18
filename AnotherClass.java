package Zad1704;

public class AnotherClass {
    public static void main(String[] args) {
        Beer warka = new Beer("Warka","lager",12.5,5.2);
        Beer anotherWarka = new Beer("Warka","lager",12.5,5.2);
        Beer tyskie = new Beer("Tyskie","lager", 12.5,5);
        System.out.println(warka.equals(anotherWarka));
        System.out.println(warka.equals(tyskie));
        System.out.println(warka.equals(warka));
        System.out.println(warka.hashCode());
        System.out.println(anotherWarka.hashCode());
        System.out.println(tyskie.hashCode());
    }
}
