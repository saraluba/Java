public class PrimeNumbers {
    public static void main(String[] args) {
        int numberOfDivisors = 0;
        for (int i = 2; i <= 100; i++) {
            for (int j = i; j >= 1; j--) {
                if (i % j == 0) {
                    numberOfDivisors = numberOfDivisors + 1;
                }
            }
            if (numberOfDivisors == 2) {
                System.out.print(i + " ");
            }
            numberOfDivisors = 0;
        }
    }
}