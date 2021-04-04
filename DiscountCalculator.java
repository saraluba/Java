import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please, provide item price: ");
        double price = scanner.nextDouble();
        System.out.print("Please,input customer age: ");
        int age = scanner.nextInt();
        if(age < 6){
            System.out.printf("Discounted price is %.2f", price - 0.8*price);
        } else if(age >= 6 && age <=18){
            System.out.printf("Discounted price is %.2f", price - 0.25*price);
        } else if(age > 65){
            System.out.printf("Discounted price is %.2f", price - 0.3*price);
        } else{
            System.out.printf("Discounted price is %.2f", price);
        }

    }
}
