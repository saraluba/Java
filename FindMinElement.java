public class FindMinElement {
    public static void main(String[] args) {
        int[] args1 = new int[args.length];
        for(int i=0; i< args.length; i++){
            args1[i] = Integer.parseInt(args[i]);
        }
        int min = args1[0];
        for(int i=1; i<args1.length; i++){
            if(args1[i]<min){
                min = args1[i];
            }
        }
        System.out.printf("Minimum number: %d", min);
    }
}
