public class AverageCalculator {
    public static void main(String[] args) {
        double sum = 0;
        int n = 0;
        for(String i: args){
            sum = sum + Double.parseDouble(i);
            n++;
        }
        System.out.println(sum/n);
    }
}
