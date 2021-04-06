public class Factorial {
    public static void main(String[] args) {
        for(int i=0; i<11; i++){
            System.out.print(F(i)+" ");
        }
    }

    private static int F(int n){
        if(n==0 || n==1){
            return 1;
        } else{
            return n*F(n-1);
        }
    }
}
