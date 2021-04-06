public class Fibonacci {
    public static void main(String[] args) {
        for(int i=0; i<10; i++){
            System.out.print(Fib(i)+" ");
        }
    }

    private static int Fib(int number){
        if(number==0){
            return 0;
        } else if(number==1){
            return 1;
        } else{
            return Fib(number-1)+Fib(number-2);
        }
    }
}
